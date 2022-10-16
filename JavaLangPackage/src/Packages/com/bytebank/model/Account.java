package Packages.com.bytebank.model;

public class Account {

  private User user;
  private boolean status;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {

    this.status = status;
  }

  @Override
  public String toString() {
    return "Account{" +
        "user=" + user +
        ", status=" + status +
        '}';
  }
}
