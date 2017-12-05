/**
 *
 */

package com.entities;

/**
 * @description: .
 * @author User
 * @create: Dec 5, 2017
 */
public class User {
  /**
   *
   */
  private String userName;
  /**
   *
   */
  private String passWord;
  /**
   * @return the userName to set
   */
  public String getUserName() {
    return userName;
  }
  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }
  /**
   * @return the passWord to set
   */
  public String getPassWord() {
    return passWord;
  }
  /**
   * @param passWord the passWord to set
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
  /**
   * @description: .
   * @author User
   * @create: Dec 5, 2017
   * @modifier:
   * @modified date:
   * @param userName
   * @param passWord
   */
  public User(String userName, String passWord) {
    super();
    this.userName = userName;
    this.passWord = passWord;
  }
  /**
   * @description: .
   * @author User
   * @create: Dec 5, 2017
   * @modifier:
   * @modified date:
   */
  public User() {
    super();
  }
  

}
