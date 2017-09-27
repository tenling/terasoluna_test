package jp.terasoluna.thin.tutorial.web.usermanager.dto;

import java.util.List;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * 
 * 一覧データ取得処理の出力クラス
 *
 */
public class ListOutput {
    
    /**
     * 表示用ユーザリスト。
     */
    private List<SelectUserOutput> users = null;

    /**
     * ユーザリストの全件数。
     */
    private String totalCount;
    
    /**
     * 表示用ユーザリストを返却する。
     * @return 表示用ユーザリスト
     */
    public List<SelectUserOutput> getUsers() {
        return users;
    }

    /**
     * 表示用ユーザリストを設定する。
     * @param users 表示用ユーザリスト
     */
    public void setUsers(List<SelectUserOutput> users) {
        this.users = users;
    }

    /**
     * ユーザリストの全件数を返却する。
     * @return ユーザリストの全件数
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * ユーザリストの全件数を設定する。
     * @param totalCount ユーザリストの全件数
     */
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
