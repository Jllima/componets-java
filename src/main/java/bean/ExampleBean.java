package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExampleBean {

	public ExampleBean() {
		// TODO Auto-generated constructor stub
	}

	private String text;

	public String upCaseText() {
		this.text = this.text.toUpperCase();
		return "show";
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
