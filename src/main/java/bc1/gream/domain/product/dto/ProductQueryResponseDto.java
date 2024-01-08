package bc1.gream.domain.product.dto;

import java.math.BigInteger;

public record ProductQueryResponseDto(
    String brand,
    String name,
    String imageUrl,
    String description,
    BigInteger price
) {

}
