package sorter.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface SortOrderSink {

    String channel = "sortOrderInputChannel";

    @Input(SortOrderSink.channel)
    SubscribableChannel sortOrder();

}
