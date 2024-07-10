package com.bms.admin.system.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "menu_tbl")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int menuId;

    @Column(name = "menu_name", nullable = false)
    private String menuName;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "menu_order", nullable = false)
    private int menuOrder;

    @Column(name = "active_yn", columnDefinition = "char(1) DEFAULT '1'")
    private char activeYn;

    @Column(name = "menu_type", columnDefinition = "varchar(10) DEFAULT 'USER'")
    private String menuType;
}
