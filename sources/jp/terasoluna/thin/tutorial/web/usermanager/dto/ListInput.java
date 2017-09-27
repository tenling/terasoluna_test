package jp.terasoluna.thin.tutorial.web.usermanager.dto;

/**
 * 
 * 一覧データ取得処理の入力クラス
 *
 */
public class ListInput {

    /**
     * 表示行数。
     */
    private String row = null;
    
    /**
     * 開始インデックス。
     */
    private String startIndex = null;
    
    /**
     * 表示行数を返却する。
     * @return 表示行数
     */
    public String getRow() {
        return row;
    }

    /**
     * 表示行数を設定する。
     * @param row 表示行数
     */
    public void setRow(String row) {
        this.row = row;
    }
    
    /**
     * 開始インデックスを返却する。
     * @return 開始インデックス
     */
    public String getStartIndex() {
        return startIndex;
    }
    
    /**
     * 開始インデックスを設定する。
     * @param startIndex 開始インデックス
     */
    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }
}