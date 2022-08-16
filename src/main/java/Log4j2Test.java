import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {
    // 定義日誌記錄器物件
    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);

    // 快速入門
    @Test
    public void testQuick() {
        long startTime = System.nanoTime();
        // 日誌輸出
        for (int i = 0; i <1000000; i++) {
            LOGGER.error("error");
            LOGGER.warn("warning");
            LOGGER.info("info");    // 預設的日誌級別資訊
            LOGGER.debug("debug");
            LOGGER.trace("trace");  // 追蹤資訊
        }
        long endTime = System.nanoTime();
        System.out.println("執行時間" + (endTime - startTime) / 1000000 + "毫秒");
    }
}