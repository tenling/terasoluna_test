package jp.terasoluna.thin.tutorial.web.logon.dto;

/**
 * ログオン処理の入力クラス。
 */
public class LogonInput {

    /**
     * ユーザID
     */
    private String userId = null;

    /**
     * ユーザIDを返却する。
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定する。
     * @param userId ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
