import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {
    // 定義日誌記錄器物件
    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);
    // 快速入門
    @Test
    public void testQuick() throws Exception {
        // 日誌訊息輸出
        LOGGER.fatal("fatal");
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}