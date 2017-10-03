package jp.terasoluna.thin.tutorial.web.usermanager.blogic;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import jp.terasoluna.fw.dao.QueryDAO;
import jp.terasoluna.fw.dao.UpdateDAO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicMessage;
import jp.terasoluna.fw.service.thin.BLogicMessages;
import jp.terasoluna.fw.service.thin.BLogicResult;
import jp.terasoluna.thin.tutorial.web.usermanager.dto.InsertInput;
import jp.terasoluna.thin.tutorial.web.usermanager.vo.SelectUserOutput;

/**
 * 登録処理を行うビジネスロジック。
 *
 */
public class InsertBLogic implements BLogic<InsertInput> {

	Logger log = Logger.getLogger(InsertBLogic.class);
    /**
     * QueryDAO。
     * Springによりインスタンス生成され設定される。
     */
    private QueryDAO queryDAO = null;
    
    /**
     * UpdateDAO。
     * Springによりインスタンス生成され設定される。
     */
    private UpdateDAO updateDAO = null;
    
    /**
     * 登録処理を行う。
     */
    public BLogicResult execute(InsertInput param) {
    	BLogicResult result = new BLogicResult();
    	SelectUserOutput selectUserOutput = null;
    	
    	try{
    		selectUserOutput 
            = queryDAO.executeForObject("getUser", param, SelectUserOutput.class);
    	}
    	catch(Exception e){
    		log.error(e.getMessage());
    	}

        
        //登録するIDが重複してる場合は異常処理をする
        if(selectUserOutput != null) {
            
            //ここから
            //エラーメッセージ処理
            BLogicMessages messages = new BLogicMessages();
                    messages.add("message", new BLogicMessage("errors.input.id.repeat"));
                    result.setErrors(messages);
                    //ここまで

            result.setResultString("failure");
            return result;
        }
        
        //登録処理
        updateDAO.execute("insertUser", param);
        
        //ここから
        //メッセージ処理
        BLogicMessages messages = new BLogicMessages();
                messages.add("message", new BLogicMessage("message.regist",param.getId()));
                result.setMessages(messages);
                //ここまで

                result.setResultString("success");
                return result;
    }

    /**
     * QueryDAOを設定する。
     * @param queryDAO
     */
    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }

    /**
     * UpdateDAOを設定する。
     * @param updateDAO
     */
    public void setUpdateDAO(UpdateDAO updateDAO) {
        this.updateDAO = updateDAO;
    }

}