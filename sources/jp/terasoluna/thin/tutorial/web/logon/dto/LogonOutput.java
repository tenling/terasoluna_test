package jp.terasoluna.thin.tutorial.web.logon.dto;

import jp.terasoluna.thin.tutorial.web.common.uvo.TutorialUVO;

/**
 * ログオン処理の出力クラス。
 *
 */
public class LogonOutput {

    /**
     * ログイン情報を保持するUserValueObject
     */
    private TutorialUVO uvo = null;

    /**
     * UserValueObjectを返却する。
     * @return UserValueObject
     */
    public TutorialUVO getUvo() {
        return uvo;
    }
    
    /**
     * UserValueObjectを設定する。
     * @param uvo UserValueObject
     */
    public void setUvo(TutorialUVO uvo) {
        this.uvo = uvo;
    }    
}