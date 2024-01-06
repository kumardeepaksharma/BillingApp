package info.inetsolve;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMPS2 database table.
 * 
 */
@Entity
@NamedQuery(name="Emps2.findAll", query="SELECT e FROM Emps2 e")
public class Emps2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer eid;

	private String dname;

	private int dno;

	private String ename;

	private String loc;

	private Integer sal;

	public Emps2() {
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getDno() {
		return this.dno;
	}

	public void setDno(Integer dno) {
		this.dno = dno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getLoc() {
		return this.loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getSal() {
		return this.sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emps2 [eid=" + eid + ", dname=" + dname + ", dno=" + dno + ", ename=" + ename + ", loc=" + loc
				+ ", sal=" + sal + "]";
}
	

}