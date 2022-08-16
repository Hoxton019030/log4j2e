
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    // 為了保證使用時，不需要每次都去建立logger 物件，我們宣告靜態常量
    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    // 快速入門
    @Test
    public void testQuick(){
        // 日誌輸出
        LOGGER.error("error");
        LOGGER.warn("warning");
        LOGGER.info("info");    // 預設的日誌級別資訊
        LOGGER.debug("debug");
        LOGGER.trace("trace");  // 追蹤資訊

        // 使用佔位符輸出日誌資訊
        String name = "java_log";
        Integer age = 18;
        LOGGER.info("使用者：{}，{}", name, age);

        // 將系統的異常資訊輸出
        try {
            int i = 1 / 0;
        } catch (Exception e){
            // e.printStackTrace();
            LOGGER.error("出現異常：", e);
        }
    }
}