package bc1.gream.domain.sell.entity;

import bc1.gream.domain.model.BaseEntity;
import bc1.gream.domain.product.entity.Product;
import bc1.gream.domain.user.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "tb_sell")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sell extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "deadline_At")
    private LocalDateTime deadlineAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Builder
    private Sell(Long price, LocalDateTime deadlineAt, User user, Product product) {
        this.price = price;
        this.deadlineAt = deadlineAt;
        this.user = user;
        this.product = product;
    }
}
