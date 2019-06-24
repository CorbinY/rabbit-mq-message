package org.corbin.rabbit_mq_message.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yin
 * @date 2019/06/15
 */
@Entity
@Data
@Builder
@Table(name = "user_info")
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {
    @Id
//    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
