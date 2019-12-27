package csuft.group.movie;

public class movie {
	String director;
	String country;
	String category;
	double commentGrade;
	String comment;
	int  commentpeople;
	public movie() {
	}
	public movie(String director, String country, String category, double commentGrade, String comment,
			int commentpeople) {
		super();
		this.director = director;
		this.country = country;
		this.category = category;
		this.commentGrade = commentGrade;
		this.comment = comment;
		this.commentpeople = commentpeople;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCommentGrade() {
		return commentGrade;
	}
	public void setCommentGrade(double commentGrade) {
		this.commentGrade = commentGrade;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCommentpeople() {
		return commentpeople;
	}
	public void setCommentpeople(int commentpeople) {
		this.commentpeople = commentpeople;
	}

}
