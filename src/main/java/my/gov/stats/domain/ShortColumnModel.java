package my.gov.stats.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Entity(name = "ShortColumnModel")
@Table(name = "SCM")
public class ShortColumnModel implements Serializable{

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "SEQ_SCM")
    @SequenceGenerator(name = "SEQ_SCM", sequenceName = "SEQ_SCM", allocationSize = 1)
    private Long id;

    @Column private String string1;
    @Column private String string2;
    @Column private String string3;
    @Column private String string4;
    @Column private String string5;
    @Column private String string6;
    @Column private String string7;
    @Column private String string8;
    @Column private String string9;
    @Column private String string10;
    @Column private Integer int1;
    @Column private Integer int2;
    @Column private Integer int3;
    @Column private Integer int4;
    @Column private Integer int5;
    @Column private Integer int6;
    @Column private Integer int7;
    @Column private Integer int8;
    @Column private Integer int9;
    @Column private Integer int10;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public String getString4() {
        return string4;
    }

    public void setString4(String string4) {
        this.string4 = string4;
    }

    public String getString5() {
        return string5;
    }

    public void setString5(String string5) {
        this.string5 = string5;
    }

    public String getString6() {
        return string6;
    }

    public void setString6(String string6) {
        this.string6 = string6;
    }

    public String getString7() {
        return string7;
    }

    public void setString7(String string7) {
        this.string7 = string7;
    }

    public String getString8() {
        return string8;
    }

    public void setString8(String string8) {
        this.string8 = string8;
    }

    public String getString9() {
        return string9;
    }

    public void setString9(String string9) {
        this.string9 = string9;
    }

    public String getString10() {
        return string10;
    }

    public void setString10(String string10) {
        this.string10 = string10;
    }

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public Integer getInt2() {
        return int2;
    }

    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    public Integer getInt3() {
        return int3;
    }

    public void setInt3(Integer int3) {
        this.int3 = int3;
    }

    public Integer getInt4() {
        return int4;
    }

    public void setInt4(Integer int4) {
        this.int4 = int4;
    }

    public Integer getInt5() {
        return int5;
    }

    public void setInt5(Integer int5) {
        this.int5 = int5;
    }

    public Integer getInt6() {
        return int6;
    }

    public void setInt6(Integer int6) {
        this.int6 = int6;
    }

    public Integer getInt7() {
        return int7;
    }

    public void setInt7(Integer int7) {
        this.int7 = int7;
    }

    public Integer getInt8() {
        return int8;
    }

    public void setInt8(Integer int8) {
        this.int8 = int8;
    }

    public Integer getInt9() {
        return int9;
    }

    public void setInt9(Integer int9) {
        this.int9 = int9;
    }

    public Integer getInt10() {
        return int10;
    }

    public void setInt10(Integer int10) {
        this.int10 = int10;
    }
}
