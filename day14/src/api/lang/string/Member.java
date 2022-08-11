package api.lang.string;

import java.util.Objects;

public class Member {
private String id;
private String pw;

public Member(String id, String pw) {
	super();
	this.id = id;
	this.pw = pw;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
@Override
public int hashCode() {
	return Objects.hash(id, pw);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Member other = (Member) obj;
	return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
}

}
