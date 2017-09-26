package jp.terasoluna.thin.tutorial.web.common.uvo;

import jp.terasoluna.fw.web.UserValueObject;
/**
 * ユーザーバリューオブジェクト実装クラス。
 *
 */
public class TutorialUVO extends UserValueObject {

    /**
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * ユーザID。
     */
    private String userId = null;

    /**
     * ユーザIDを返却する。
     *
     * @return 保持するユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定する。
     *
     * @param userId ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
