package bc1.gream.domain.buy.mapper;

import bc1.gream.domain.buy.dto.response.BuyBidResponseDto;
import bc1.gream.domain.buy.dto.response.BuyNowResponseDto;
import bc1.gream.domain.buy.entity.Buy;
import bc1.gream.domain.order.entity.Order;
import bc1.gream.domain.product.dto.response.TradeResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BuyMapper {

    BuyMapper INSTANCE = Mappers.getMapper(BuyMapper.class);

    @Mapping(source = "id", target = "buyId")
    BuyBidResponseDto toBuyBidResponseDto(Buy buy);

    @Mapping(source = "price", target = "price")
    @Mapping(source = "createdAt", target = "tradeDate")
    @Mapping(source = "id", target = "id")
    TradeResponseDto toTradeResponseDto(Buy buy);

    @Mapping(source = "id", target = "orderId")
    BuyNowResponseDto toBuyNowResponseDto(Order order);
}
