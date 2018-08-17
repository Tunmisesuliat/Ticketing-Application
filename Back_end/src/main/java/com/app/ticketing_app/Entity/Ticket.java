package com.app.ticketing_app.Entity;

import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ticket_tab")
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name = "ticket_generator", sequenceName = "ticket_seq", allocationSize=100)
	private Long ticket_id;
	private Long terminal_id;
	private String account_no;
	private String pan;
	private String phone_no;
	private Date trans_date;
	private Double amount;	
	private String channel;
	@DateTimeFormat(pattern="yyy-MM-dd'T'HH:mm:ss")
	private Date log_date;

	
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public Long getTerminal_id() {
		return terminal_id;
	}
	public void setTerminal_id(Long terminal_id) {
		this.terminal_id = terminal_id;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Date getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Date getLog_date() {
		return log_date;
	}
	public void setLog_date(Date log_date) {
		this.log_date = log_date;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", terminal_id=" + terminal_id + ", account_no=" + account_no
				+ ", pan=" + pan + ", phone_no=" + phone_no + ", trans_date=" + trans_date + ", amount=" + amount
				+ ", channel=" + channel + ", log_date=" + log_date + "]";
	}
	
}
