package test.wn.service;


import test.wn.BaseService;
import test.wn.bean.Liuqian;
import test.wn.core.TestDB;
import yao.util.db.tool.Select;
import yao.util.db.where.Expression;

import java.sql.SQLException;
import java.util.List;

/**
 * @author liuqian
 * @Date 2016/3/2 17:46
 */
public class LiuqianService extends BaseService {

    /**
     * 获取所有的数据
     * @return
     * @throws SQLException
     */
    public static List<Liuqian> getAll() throws SQLException {
        return getSelect().select(Liuqian.class);
    }
    public static Liuqian getById(Integer id) throws SQLException {
        Expression where = new Expression("id").eq(id);

        String sql = "select * from liuqian where id=?";
        return getSelect().selectSingle(Liuqian.class, sql, new Object[]{id});
    }

    /**
     * 添加数据
     * @param lq
     * @return
     * @throws SQLException
     */
    public static Liuqian save(Liuqian lq) throws SQLException {
        lq.setId(TestDB.TestDB().getUpdate().insertAndGetGeneratedKeys(lq).intValue());
        return lq;
    }

    /**
     * 删除数据
     * @param lq
     * @return
     * @throws SQLException
     */
    public static int delete(Liuqian lq) throws SQLException {
        return TestDB.TestDB().getUpdate().deleteSingle(lq);
    }

    /**
     * 修改数据
     * @param lq
     * @return
     * @throws SQLException
     */
    public static int update(Liuqian lq) throws  SQLException {
        return TestDB.TestDB().getUpdate().updateSingle(lq);
    }

}
