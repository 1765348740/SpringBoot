package com.zlx.case17;

import com.zlx.case17.lucence.Indexer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.zlx.case17.lucence.ChineseSearch.search;

@SpringBootTest
class Case17ApplicationTests {

    /*
    *    构建索引
    * */
    @Test
    void contextLoads() {
        //索引保存到的路径
        String indexDir = "D:\\lucene";
        //需要索引的文件数据存放的目录
        String dataDir = "D:\\lucene\\data";
        Indexer indexer = null;
        int indexedNum = 0;
        //记录索引开始时间
        long startTime = System.currentTimeMillis();
        try {
            // 开始构建索引
            indexer = new Indexer(indexDir);
            indexedNum = indexer.indexAll(dataDir);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != indexer) {
                    indexer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //记录索引结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("索引耗时" + (endTime - startTime) + "毫秒");
        System.out.println("共索引了" + indexedNum + "个文件");
    }


    @Test
    void test() {
        String indexDir = "D:\\lucene";
        //查询这个字符串
        String q = "com";
        try {
            search(indexDir, q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
