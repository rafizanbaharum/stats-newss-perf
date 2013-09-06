package my.gov.stats.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author rafizan.baharum
 * @since 9/5/13
 */
@Entity(name = "HugeColumnModel")
@Table(name = "HCM")
public class HugeColumnModel implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator = "SEQ_HCM")
    @SequenceGenerator(name = "SEQ_HCM", sequenceName = "SEQ_HCM", allocationSize = 1)
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
    private String string41;
    @Column
    private String string42;
    @Column
    private String string43;
    @Column
    private String string44;
    @Column
    private String string45;
    @Column
    private String string46;
    @Column
    private String string47;
    @Column
    private String string48;
    @Column
    private String string49;
    @Column
    private String string50;
    @Column
    private String string51;
    @Column
    private String string52;
    @Column
    private String string53;
    @Column
    private String string54;
    @Column
    private String string55;
    @Column
    private String string56;
    @Column
    private String string57;
    @Column
    private String string58;
    @Column
    private String string59;
    @Column
    private String string60;
    @Column
    private String string61;
    @Column
    private String string62;
    @Column
    private String string63;
    @Column
    private String string64;
    @Column
    private String string65;
    @Column
    private String string66;
    @Column
    private String string67;
    @Column
    private String string68;
    @Column
    private String string69;
    @Column
    private String string70;
    @Column
    private String string71;
    @Column
    private String string72;
    @Column
    private String string73;
    @Column
    private String string74;
    @Column
    private String string75;
    @Column
    private String string76;
    @Column
    private String string77;
    @Column
    private String string78;
    @Column
    private String string79;
    @Column
    private String string80;
    @Column
    private String string81;
    @Column
    private String string82;
    @Column
    private String string83;
    @Column
    private String string84;
    @Column
    private String string85;
    @Column
    private String string86;
    @Column
    private String string87;
    @Column
    private String string88;
    @Column
    private String string89;
    @Column
    private String string90;
    @Column
    private String string91;
    @Column
    private String string92;
    @Column
    private String string93;
    @Column
    private String string94;
    @Column
    private String string95;
    @Column
    private String string96;
    @Column
    private String string97;
    @Column
    private String string98;
    @Column
    private String string99;
    @Column
    private String string100;
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
    @Column
    private Integer int41;
    @Column
    private Integer int42;
    @Column
    private Integer int43;
    @Column
    private Integer int44;
    @Column
    private Integer int45;
    @Column
    private Integer int46;
    @Column
    private Integer int47;
    @Column
    private Integer int48;
    @Column
    private Integer int49;
    @Column
    private Integer int50;
    @Column
    private Integer int51;
    @Column
    private Integer int52;
    @Column
    private Integer int53;
    @Column
    private Integer int54;
    @Column
    private Integer int55;
    @Column
    private Integer int56;
    @Column
    private Integer int57;
    @Column
    private Integer int58;
    @Column
    private Integer int59;
    @Column
    private Integer int60;
    @Column
    private Integer int61;
    @Column
    private Integer int62;
    @Column
    private Integer int63;
    @Column
    private Integer int64;
    @Column
    private Integer int65;
    @Column
    private Integer int66;
    @Column
    private Integer int67;
    @Column
    private Integer int68;
    @Column
    private Integer int69;
    @Column
    private Integer int70;
    @Column
    private Integer int71;
    @Column
    private Integer int72;
    @Column
    private Integer int73;
    @Column
    private Integer int74;
    @Column
    private Integer int75;
    @Column
    private Integer int76;
    @Column
    private Integer int77;
    @Column
    private Integer int78;
    @Column
    private Integer int79;
    @Column
    private Integer int80;
    @Column
    private Integer int81;
    @Column
    private Integer int82;
    @Column
    private Integer int83;
    @Column
    private Integer int84;
    @Column
    private Integer int85;
    @Column
    private Integer int86;
    @Column
    private Integer int87;
    @Column
    private Integer int88;
    @Column
    private Integer int89;
    @Column
    private Integer int90;
    @Column
    private Integer int91;
    @Column
    private Integer int92;
    @Column
    private Integer int93;
    @Column
    private Integer int94;
    @Column
    private Integer int95;
    @Column
    private Integer int96;
    @Column
    private Integer int97;
    @Column
    private Integer int98;
    @Column
    private Integer int99;
    @Column
    private Integer int100;


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

    public String getString41() {
        return string41;
    }

    public void setString41(String string41) {
        this.string41 = string41;
    }

    public String getString42() {
        return string42;
    }

    public void setString42(String string42) {
        this.string42 = string42;
    }

    public String getString43() {
        return string43;
    }

    public void setString43(String string43) {
        this.string43 = string43;
    }

    public String getString44() {
        return string44;
    }

    public void setString44(String string44) {
        this.string44 = string44;
    }

    public String getString45() {
        return string45;
    }

    public void setString45(String string45) {
        this.string45 = string45;
    }

    public String getString46() {
        return string46;
    }

    public void setString46(String string46) {
        this.string46 = string46;
    }

    public String getString47() {
        return string47;
    }

    public void setString47(String string47) {
        this.string47 = string47;
    }

    public String getString48() {
        return string48;
    }

    public void setString48(String string48) {
        this.string48 = string48;
    }

    public String getString49() {
        return string49;
    }

    public void setString49(String string49) {
        this.string49 = string49;
    }

    public String getString50() {
        return string50;
    }

    public void setString50(String string50) {
        this.string50 = string50;
    }

    public String getString51() {
        return string51;
    }

    public void setString51(String string51) {
        this.string51 = string51;
    }

    public String getString52() {
        return string52;
    }

    public void setString52(String string52) {
        this.string52 = string52;
    }

    public String getString53() {
        return string53;
    }

    public void setString53(String string53) {
        this.string53 = string53;
    }

    public String getString54() {
        return string54;
    }

    public void setString54(String string54) {
        this.string54 = string54;
    }

    public String getString55() {
        return string55;
    }

    public void setString55(String string55) {
        this.string55 = string55;
    }

    public String getString56() {
        return string56;
    }

    public void setString56(String string56) {
        this.string56 = string56;
    }

    public String getString57() {
        return string57;
    }

    public void setString57(String string57) {
        this.string57 = string57;
    }

    public String getString58() {
        return string58;
    }

    public void setString58(String string58) {
        this.string58 = string58;
    }

    public String getString59() {
        return string59;
    }

    public void setString59(String string59) {
        this.string59 = string59;
    }

    public String getString60() {
        return string60;
    }

    public void setString60(String string60) {
        this.string60 = string60;
    }

    public String getString61() {
        return string61;
    }

    public void setString61(String string61) {
        this.string61 = string61;
    }

    public String getString62() {
        return string62;
    }

    public void setString62(String string62) {
        this.string62 = string62;
    }

    public String getString63() {
        return string63;
    }

    public void setString63(String string63) {
        this.string63 = string63;
    }

    public String getString64() {
        return string64;
    }

    public void setString64(String string64) {
        this.string64 = string64;
    }

    public String getString65() {
        return string65;
    }

    public void setString65(String string65) {
        this.string65 = string65;
    }

    public String getString66() {
        return string66;
    }

    public void setString66(String string66) {
        this.string66 = string66;
    }

    public String getString67() {
        return string67;
    }

    public void setString67(String string67) {
        this.string67 = string67;
    }

    public String getString68() {
        return string68;
    }

    public void setString68(String string68) {
        this.string68 = string68;
    }

    public String getString69() {
        return string69;
    }

    public void setString69(String string69) {
        this.string69 = string69;
    }

    public String getString70() {
        return string70;
    }

    public void setString70(String string70) {
        this.string70 = string70;
    }

    public String getString71() {
        return string71;
    }

    public void setString71(String string71) {
        this.string71 = string71;
    }

    public String getString72() {
        return string72;
    }

    public void setString72(String string72) {
        this.string72 = string72;
    }

    public String getString73() {
        return string73;
    }

    public void setString73(String string73) {
        this.string73 = string73;
    }

    public String getString74() {
        return string74;
    }

    public void setString74(String string74) {
        this.string74 = string74;
    }

    public String getString75() {
        return string75;
    }

    public void setString75(String string75) {
        this.string75 = string75;
    }

    public String getString76() {
        return string76;
    }

    public void setString76(String string76) {
        this.string76 = string76;
    }

    public String getString77() {
        return string77;
    }

    public void setString77(String string77) {
        this.string77 = string77;
    }

    public String getString78() {
        return string78;
    }

    public void setString78(String string78) {
        this.string78 = string78;
    }

    public String getString79() {
        return string79;
    }

    public void setString79(String string79) {
        this.string79 = string79;
    }

    public String getString80() {
        return string80;
    }

    public void setString80(String string80) {
        this.string80 = string80;
    }

    public String getString81() {
        return string81;
    }

    public void setString81(String string81) {
        this.string81 = string81;
    }

    public String getString82() {
        return string82;
    }

    public void setString82(String string82) {
        this.string82 = string82;
    }

    public String getString83() {
        return string83;
    }

    public void setString83(String string83) {
        this.string83 = string83;
    }

    public String getString84() {
        return string84;
    }

    public void setString84(String string84) {
        this.string84 = string84;
    }

    public String getString85() {
        return string85;
    }

    public void setString85(String string85) {
        this.string85 = string85;
    }

    public String getString86() {
        return string86;
    }

    public void setString86(String string86) {
        this.string86 = string86;
    }

    public String getString87() {
        return string87;
    }

    public void setString87(String string87) {
        this.string87 = string87;
    }

    public String getString88() {
        return string88;
    }

    public void setString88(String string88) {
        this.string88 = string88;
    }

    public String getString89() {
        return string89;
    }

    public void setString89(String string89) {
        this.string89 = string89;
    }

    public String getString90() {
        return string90;
    }

    public void setString90(String string90) {
        this.string90 = string90;
    }

    public String getString91() {
        return string91;
    }

    public void setString91(String string91) {
        this.string91 = string91;
    }

    public String getString92() {
        return string92;
    }

    public void setString92(String string92) {
        this.string92 = string92;
    }

    public String getString93() {
        return string93;
    }

    public void setString93(String string93) {
        this.string93 = string93;
    }

    public String getString94() {
        return string94;
    }

    public void setString94(String string94) {
        this.string94 = string94;
    }

    public String getString95() {
        return string95;
    }

    public void setString95(String string95) {
        this.string95 = string95;
    }

    public String getString96() {
        return string96;
    }

    public void setString96(String string96) {
        this.string96 = string96;
    }

    public String getString97() {
        return string97;
    }

    public void setString97(String string97) {
        this.string97 = string97;
    }

    public String getString98() {
        return string98;
    }

    public void setString98(String string98) {
        this.string98 = string98;
    }

    public String getString99() {
        return string99;
    }

    public void setString99(String string99) {
        this.string99 = string99;
    }

    public String getString100() {
        return string100;
    }

    public void setString100(String string100) {
        this.string100 = string100;
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

    public Integer getInt41() {
        return int41;
    }

    public void setInt41(Integer int41) {
        this.int41 = int41;
    }

    public Integer getInt42() {
        return int42;
    }

    public void setInt42(Integer int42) {
        this.int42 = int42;
    }

    public Integer getInt43() {
        return int43;
    }

    public void setInt43(Integer int43) {
        this.int43 = int43;
    }

    public Integer getInt44() {
        return int44;
    }

    public void setInt44(Integer int44) {
        this.int44 = int44;
    }

    public Integer getInt45() {
        return int45;
    }

    public void setInt45(Integer int45) {
        this.int45 = int45;
    }

    public Integer getInt46() {
        return int46;
    }

    public void setInt46(Integer int46) {
        this.int46 = int46;
    }

    public Integer getInt47() {
        return int47;
    }

    public void setInt47(Integer int47) {
        this.int47 = int47;
    }

    public Integer getInt48() {
        return int48;
    }

    public void setInt48(Integer int48) {
        this.int48 = int48;
    }

    public Integer getInt49() {
        return int49;
    }

    public void setInt49(Integer int49) {
        this.int49 = int49;
    }

    public Integer getInt50() {
        return int50;
    }

    public void setInt50(Integer int50) {
        this.int50 = int50;
    }

    public Integer getInt51() {
        return int51;
    }

    public void setInt51(Integer int51) {
        this.int51 = int51;
    }

    public Integer getInt52() {
        return int52;
    }

    public void setInt52(Integer int52) {
        this.int52 = int52;
    }

    public Integer getInt53() {
        return int53;
    }

    public void setInt53(Integer int53) {
        this.int53 = int53;
    }

    public Integer getInt54() {
        return int54;
    }

    public void setInt54(Integer int54) {
        this.int54 = int54;
    }

    public Integer getInt55() {
        return int55;
    }

    public void setInt55(Integer int55) {
        this.int55 = int55;
    }

    public Integer getInt56() {
        return int56;
    }

    public void setInt56(Integer int56) {
        this.int56 = int56;
    }

    public Integer getInt57() {
        return int57;
    }

    public void setInt57(Integer int57) {
        this.int57 = int57;
    }

    public Integer getInt58() {
        return int58;
    }

    public void setInt58(Integer int58) {
        this.int58 = int58;
    }

    public Integer getInt59() {
        return int59;
    }

    public void setInt59(Integer int59) {
        this.int59 = int59;
    }

    public Integer getInt60() {
        return int60;
    }

    public void setInt60(Integer int60) {
        this.int60 = int60;
    }

    public Integer getInt61() {
        return int61;
    }

    public void setInt61(Integer int61) {
        this.int61 = int61;
    }

    public Integer getInt62() {
        return int62;
    }

    public void setInt62(Integer int62) {
        this.int62 = int62;
    }

    public Integer getInt63() {
        return int63;
    }

    public void setInt63(Integer int63) {
        this.int63 = int63;
    }

    public Integer getInt64() {
        return int64;
    }

    public void setInt64(Integer int64) {
        this.int64 = int64;
    }

    public Integer getInt65() {
        return int65;
    }

    public void setInt65(Integer int65) {
        this.int65 = int65;
    }

    public Integer getInt66() {
        return int66;
    }

    public void setInt66(Integer int66) {
        this.int66 = int66;
    }

    public Integer getInt67() {
        return int67;
    }

    public void setInt67(Integer int67) {
        this.int67 = int67;
    }

    public Integer getInt68() {
        return int68;
    }

    public void setInt68(Integer int68) {
        this.int68 = int68;
    }

    public Integer getInt69() {
        return int69;
    }

    public void setInt69(Integer int69) {
        this.int69 = int69;
    }

    public Integer getInt70() {
        return int70;
    }

    public void setInt70(Integer int70) {
        this.int70 = int70;
    }

    public Integer getInt71() {
        return int71;
    }

    public void setInt71(Integer int71) {
        this.int71 = int71;
    }

    public Integer getInt72() {
        return int72;
    }

    public void setInt72(Integer int72) {
        this.int72 = int72;
    }

    public Integer getInt73() {
        return int73;
    }

    public void setInt73(Integer int73) {
        this.int73 = int73;
    }

    public Integer getInt74() {
        return int74;
    }

    public void setInt74(Integer int74) {
        this.int74 = int74;
    }

    public Integer getInt75() {
        return int75;
    }

    public void setInt75(Integer int75) {
        this.int75 = int75;
    }

    public Integer getInt76() {
        return int76;
    }

    public void setInt76(Integer int76) {
        this.int76 = int76;
    }

    public Integer getInt77() {
        return int77;
    }

    public void setInt77(Integer int77) {
        this.int77 = int77;
    }

    public Integer getInt78() {
        return int78;
    }

    public void setInt78(Integer int78) {
        this.int78 = int78;
    }

    public Integer getInt79() {
        return int79;
    }

    public void setInt79(Integer int79) {
        this.int79 = int79;
    }

    public Integer getInt80() {
        return int80;
    }

    public void setInt80(Integer int80) {
        this.int80 = int80;
    }

    public Integer getInt81() {
        return int81;
    }

    public void setInt81(Integer int81) {
        this.int81 = int81;
    }

    public Integer getInt82() {
        return int82;
    }

    public void setInt82(Integer int82) {
        this.int82 = int82;
    }

    public Integer getInt83() {
        return int83;
    }

    public void setInt83(Integer int83) {
        this.int83 = int83;
    }

    public Integer getInt84() {
        return int84;
    }

    public void setInt84(Integer int84) {
        this.int84 = int84;
    }

    public Integer getInt85() {
        return int85;
    }

    public void setInt85(Integer int85) {
        this.int85 = int85;
    }

    public Integer getInt86() {
        return int86;
    }

    public void setInt86(Integer int86) {
        this.int86 = int86;
    }

    public Integer getInt87() {
        return int87;
    }

    public void setInt87(Integer int87) {
        this.int87 = int87;
    }

    public Integer getInt88() {
        return int88;
    }

    public void setInt88(Integer int88) {
        this.int88 = int88;
    }

    public Integer getInt89() {
        return int89;
    }

    public void setInt89(Integer int89) {
        this.int89 = int89;
    }

    public Integer getInt90() {
        return int90;
    }

    public void setInt90(Integer int90) {
        this.int90 = int90;
    }

    public Integer getInt91() {
        return int91;
    }

    public void setInt91(Integer int91) {
        this.int91 = int91;
    }

    public Integer getInt92() {
        return int92;
    }

    public void setInt92(Integer int92) {
        this.int92 = int92;
    }

    public Integer getInt93() {
        return int93;
    }

    public void setInt93(Integer int93) {
        this.int93 = int93;
    }

    public Integer getInt94() {
        return int94;
    }

    public void setInt94(Integer int94) {
        this.int94 = int94;
    }

    public Integer getInt95() {
        return int95;
    }

    public void setInt95(Integer int95) {
        this.int95 = int95;
    }

    public Integer getInt96() {
        return int96;
    }

    public void setInt96(Integer int96) {
        this.int96 = int96;
    }

    public Integer getInt97() {
        return int97;
    }

    public void setInt97(Integer int97) {
        this.int97 = int97;
    }

    public Integer getInt98() {
        return int98;
    }

    public void setInt98(Integer int98) {
        this.int98 = int98;
    }

    public Integer getInt99() {
        return int99;
    }

    public void setInt99(Integer int99) {
        this.int99 = int99;
    }

    public Integer getInt100() {
        return int100;
    }

    public void setInt100(Integer int100) {
        this.int100 = int100;
    }
}
