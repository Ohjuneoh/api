package sample11_bank;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//서비스에 있는 기능은 좀 더 구체적임, 
//클라이언트의 요청을 구체화 시켜놓음
//서비스의 기능 하나 하나는 웹 사이트의 각 항목에대해 1대1 매칭된다,

public class BankingService {
	
	private BankingRepository repo = new BankingRepository();
	
	//신규계좌 개설하기 기능
	/* 사용자가 입력한 신규 계좌정보를 전달받아서 영속화계층에 저장시키고, 개설된 계좌정보를 반환한다.
	 * 반환타입 : Account
	 * 메소드명 : creatAccount 
	 * 매개변수 : Account account
	 */
	public Account createAccount(Account account) {
		
		//전달받은 계좌정보에 계좌상태, 개설일시를 저장한다.
		account.setStatus("사용중");
		account.setCreatedDate(new Date());
		
		//영속화 계층에 계좌정보를 전달해서 저장시킨다.
		repo.insertAccount(account);
		return account;
	}
	// 전계좌 조회하기
	/*
	 * 예금주명을 전달받아서 예금주명을 통해 개설된 모든 계좌정보를 조회 후 반환한다.q
	 * 반환타입 : List<Account>
	 * 메소드명 : getMyAllAccounts
	 * 매개변수 : String name
	 */
	public List<Account> getMyAllAccount(String name){
		List<Account> accounts = repo.getAccountByName(name);
		
		return accounts;
	}
	
	
	
	//계좌상세정보 조회하기
	/*
	 * 계좌번호와 비밀번호를 전달받아서 계좌상세정보를 반환한다.
	 * 반환타입 : Account
	 * 메소드명 : getAccountDetail
	 * 매개변수 : int accNo
	 */
	
	public Account getAccountDetail(int accNo,int pwd) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return null;
		}
		if(account.getPassword() != pwd) {
			return null;
		}
		return account;
	}
	
	//입금하기
	/*
	 * 계좌번호와 입금액을 전달받아서 현재 잔액을 증가시킨다.
	 * 반환타입 : boolean
	 * 메소드명 : deposit
	 * 매개변수 : int accNo, long amount
	 */
	public boolean deposit(int accNo, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return false;
		}	
		long balance = account.getBalance() + amount;
		account.setBalance(balance);
		
		return true;
	}
	
	//출금하기
	/*
	 * 
	 * 반환타입 : boolean
	 * 메소드명 : withdraw
	 * 매개변수 : int accNo, int pwd, long amount
	 */
	public boolean withdraw(int accNo, int pwd, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			return false;
		}
		if(pwd != account.getPassword()) {
			return false;
		} 
		if (amount > account.getBalance()) {
			return false;
		}
		long balance = account.getBalance() - amount;
		account.setBalance(balance);
		return true;
		
		
	}
	//else if 하나의 값에 대해서 여러가지 조건이 있을 때
	//비밀번호 변경하기
	
	public boolean changePassword(int no, int prePwd, int newPwd) {
		Account account = repo.getAccountByNo(no);
		
		if(account == null) {
			return false;
		}
		if(prePwd != account.getPassword()) {
			return false;
		}
		if(prePwd == account.getPassword()) {
			account.setPassword(newPwd);
		}
		return true;
		
		
	}
	
	
	//해지하기
	public Map<String, Object> expireAccount(int accNo, int password){
		Map<String, Object> result = new HashMap<>();
		
		Account account = repo.getAccountByNo(accNo);
		if(account == null) {
			result.put("success", false);
			return result;
		}
		if(account.getPassword() != password) {
			result.put("success", false);
			return result;
			
		}
		int intrest = (int) (account.getBalance()*account.getInterestRate());
		result.put("success", true);
		result.put("no", account.getNo());
		result.put("owner",account.getOwner());
		result.put("balance",account.getBalance());
		result.put("intrest", intrest); //이자
		result.put("amount", account.getBalance() + intrest); //이자
		
		repo.deleteAccount(accNo);
		
		return result;
	}
	

}
