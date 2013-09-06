package my.gov.stats.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Entity(name = "MediumColumnModel")
@Table(name = "MCM")
public class MediumColumnModel implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "SEQ_MCM")
    @SequenceGenerator(name = "SEQ_MCM", sequenceName = "SEQ_MCM", allocationSize = 1)
    private Long id;
    @Column
    private String string1;
    @Column
    private String string2;
    @Column
    private String string3;
    @Column
    private String string4;
    @Column
    private String string5;
    @Column
    private String string6;
    @Column
    private String string7;
    @Column
    private String string8;
    @Column
    private String string9;
    @Column
    private String string10;
    @Column
    private String string11;
    @Column
    private String string12;
    @Column
    private String string13;
    @Column
    private String string14;
    @Column
    private String string15;
    @Column
    private String string16;
    @Column
    private String string17;
    @Column
    private String string18;
    @Column
    private String string19;
    @Column
    private String string20;
    @Column
    private String string21;
    @Column
    private String string22;
    @Column
    private String string23;
    @Column
    private String string24;
    @Column
    private String string25;
    @Column
    private String string26;
    @Column
    private String string27;
    @Column
    private String string28;
    @Column
    private String string29;
    @Column
    private String string30;
    @Column
    private String string31;
    @Column
    private String string32;
    @Column
    private String string33;
    @Column
    private String string34;
    @Column
    private String string35;
    @Column
    private String string36;
    @Column
    private String string37;
    @Column
    private String string38;
    @Column
    private String string39;
    @Column
    private String string40;
    @Column
    private Integer int1;
    @Column
    private Integer int2;
    @Column
    private Integer int3;
    @Column
    private Integer int4;
    @Column
    private Integer int5;
    @Column
    private Integer int6;
    @Column
    private Integer int7;
    @Column
    private Integer int8;
    @Column
    private Integer int9;
    @Column
    private Integer int10;
    @Column
    private Integer int11;
    @Column
    private Integer int12;
    @Column
    private Integer int13;
    @Column
    private Integer int14;
    @Column
    private Integer int15;
    @Column
    private Integer int16;
    @Column
    private Integer int17;
    @Column
    private Integer int18;
    @Column
    private Integer int19;
    @Column
    private Integer int20;
    @Column
    private Integer int21;
    @Column
    private Integer int22;
    @Column
    private Integer int23;
    @Column
    private Integer int24;
    @Column
    private Integer int25;
    @Column
    private Integer int26;
    @Column
    private Integer int27;
    @Column
    private Integer int28;
    @Column
    private Integer int29;
    @Column
    private Integer int30;
    @Column
    private Integer int31;
    @Column
    private Integer int32;
    @Column
    private Integer int33;
    @Column
    private Integer int34;
    @Column
    private Integer int35;
    @Column
    private Integer int36;
    @Column
    private Integer int37;
    @Column
    private Integer int38;
    @Column
    private Integer int39;
    @Column
    private Integer int40;

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

    public String getString11() {
        return string11;
    }

    public void setString11(String string11) {
        this.string11 = string11;
    }

    public String getString12() {
        return string12;
    }

    public void setString12(String string12) {
        this.string12 = string12;
    }

    public String getString13() {
        return string13;
    }

    public void setString13(String string13) {
        this.string13 = string13;
    }

    public String getString14() {
        return string14;
    }

    public void setString14(String string14) {
        this.string14 = string14;
    }

    public String getString15() {
        return string15;
    }

    public void setString15(String string15) {
        this.string15 = string15;
    }

    public String getString16() {
        return string16;
    }

    public void setString16(String string16) {
        this.string16 = string16;
    }

    public String getString17() {
        return string17;
    }

    public void setString17(String string17) {
        this.string17 = string17;
    }

    public String getString18() {
        return string18;
    }

    public void setString18(String string18) {
        this.string18 = string18;
    }

    public String getString19() {
        return string19;
    }

    public void setString19(String string19) {
        this.string19 = string19;
    }

    public String getString20() {
        return string20;
    }

    public void setString20(String string20) {
        this.string20 = string20;
    }

    public String getString21() {
        return string21;
    }

    public void setString21(String string21) {
        this.string21 = string21;
    }

    public String getString22() {
        return string22;
    }

    public void setString22(String string22) {
        this.string22 = string22;
    }

    public String getString23() {
        return string23;
    }

    public void setString23(String string23) {
        this.string23 = string23;
    }

    public String getString24() {
        return string24;
    }

    public void setString24(String string24) {
        this.string24 = string24;
    }

    public String getString25() {
        return string25;
    }

    public void setString25(String string25) {
        this.string25 = string25;
    }

    public String getString26() {
        return string26;
    }

    public void setString26(String string26) {
        this.string26 = string26;
    }

    public String getString27() {
        return string27;
    }

    public void setString27(String string27) {
        this.string27 = string27;
    }

    public String getString28() {
        return string28;
    }

    public void setString28(String string28) {
        this.string28 = string28;
    }

    public String getString29() {
        return string29;
    }

    public void setString29(String string29) {
        this.string29 = string29;
    }

    public String getString30() {
        return string30;
    }

    public void setString30(String string30) {
        this.string30 = string30;
    }

    public String getString31() {
        return string31;
    }

    public void setString31(String string31) {
        this.string31 = string31;
    }

    public String getString32() {
        return string32;
    }

    public void setString32(String string32) {
        this.string32 = string32;
    }

    public String getString33() {
        return string33;
    }

    public void setString33(String string33) {
        this.string33 = string33;
    }

    public String getString34() {
        return string34;
    }

    public void setString34(String string34) {
        this.string34 = string34;
    }

    public String getString35() {
        return string35;
    }

    public void setString35(String string35) {
        this.string35 = string35;
    }

    public String getString36() {
        return string36;
    }

    public void setString36(String string36) {
        this.string36 = string36;
    }

    public String getString37() {
        return string37;
    }

    public void setString37(String string37) {
        this.string37 = string37;
    }

    public String getString38() {
        return string38;
    }

    public void setString38(String string38) {
        this.string38 = string38;
    }

    public String getString39() {
        return string39;
    }

    public void setString39(String string39) {
        this.string39 = string39;
    }

    public String getString40() {
        return string40;
    }

    public void setString40(String string40) {
        this.string40 = string40;
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

    public Integer getInt11() {
        return int11;
    }

    public void setInt11(Integer int11) {
        this.int11 = int11;
    }

    public Integer getInt12() {
        return int12;
    }

    public void setInt12(Integer int12) {
        this.int12 = int12;
    }

    public Integer getInt13() {
        return int13;
    }

    public void setInt13(Integer int13) {
        this.int13 = int13;
    }

    public Integer getInt14() {
        return int14;
    }

    public void setInt14(Integer int14) {
        this.int14 = int14;
    }

    public Integer getInt15() {
        return int15;
    }

    public void setInt15(Integer int15) {
        this.int15 = int15;
    }

    public Integer getInt16() {
        return int16;
    }

    public void setInt16(Integer int16) {
        this.int16 = int16;
    }

    public Integer getInt17() {
        return int17;
    }

    public void setInt17(Integer int17) {
        this.int17 = int17;
    }

    public Integer getInt18() {
        return int18;
    }

    public void setInt18(Integer int18) {
        this.int18 = int18;
    }

    public Integer getInt19() {
        return int19;
    }

    public void setInt19(Integer int19) {
        this.int19 = int19;
    }

    public Integer getInt20() {
        return int20;
    }

    public void setInt20(Integer int20) {
        this.int20 = int20;
    }

    public Integer getInt21() {
        return int21;
    }

    public void setInt21(Integer int21) {
        this.int21 = int21;
    }

    public Integer getInt22() {
        return int22;
    }

    public void setInt22(Integer int22) {
        this.int22 = int22;
    }

    public Integer getInt23() {
        return int23;
    }

    public void setInt23(Integer int23) {
        this.int23 = int23;
    }

    public Integer getInt24() {
        return int24;
    }

    public void setInt24(Integer int24) {
        this.int24 = int24;
    }

    public Integer getInt25() {
        return int25;
    }

    public void setInt25(Integer int25) {
        this.int25 = int25;
    }

    public Integer getInt26() {
        return int26;
    }

    public void setInt26(Integer int26) {
        this.int26 = int26;
    }

    public Integer getInt27() {
        return int27;
    }

    public void setInt27(Integer int27) {
        this.int27 = int27;
    }

    public Integer getInt28() {
        return int28;
    }

    public void setInt28(Integer int28) {
        this.int28 = int28;
    }

    public Integer getInt29() {
        return int29;
    }

    public void setInt29(Integer int29) {
        this.int29 = int29;
    }

    public Integer getInt30() {
        return int30;
    }

    public void setInt30(Integer int30) {
        this.int30 = int30;
    }

    public Integer getInt31() {
        return int31;
    }

    public void setInt31(Integer int31) {
        this.int31 = int31;
    }

    public Integer getInt32() {
        return int32;
    }

    public void setInt32(Integer int32) {
        this.int32 = int32;
    }

    public Integer getInt33() {
        return int33;
    }

    public void setInt33(Integer int33) {
        this.int33 = int33;
    }

    public Integer getInt34() {
        return int34;
    }

    public void setInt34(Integer int34) {
        this.int34 = int34;
    }

    public Integer getInt35() {
        return int35;
    }

    public void setInt35(Integer int35) {
        this.int35 = int35;
    }

    public Integer getInt36() {
        return int36;
    }

    public void setInt36(Integer int36) {
        this.int36 = int36;
    }

    public Integer getInt37() {
        return int37;
    }

    public void setInt37(Integer int37) {
        this.int37 = int37;
    }

    public Integer getInt38() {
        return int38;
    }

    public void setInt38(Integer int38) {
        this.int38 = int38;
    }

    public Integer getInt39() {
        return int39;
    }

    public void setInt39(Integer int39) {
        this.int39 = int39;
    }

    public Integer getInt40() {
        return int40;
    }

    public void setInt40(Integer int40) {
        this.int40 = int40;
    }
}
