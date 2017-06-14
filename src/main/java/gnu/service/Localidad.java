package gnu.service;

import java.util.Arrays;

/**
 * Created by franco on 20/04/17.
 */
public class Localidad {

    private String[] caratulas;
    private String[] proveidos;
    private String[] nombresCaratulas;
    private String[] nombresProveidos;

    private String name;
    public Localidad(){}

    public Localidad(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLinkCaratulas() {
        return caratulas;
    }

    public void setLinkCaratulas(String[] caratulas) {
        this.caratulas = caratulas;
    }

    public String[] getLinkProveidos() {
        return proveidos;
    }

    public void setLinkProveidos(String[] proveidos) {
        this.proveidos = proveidos;
    }

    public String[] getNombresCaratulas() {
        return nombresCaratulas;
    }

    public void setNombresCaratulas(String[] nombresCaratulas) {
        this.nombresCaratulas = nombresCaratulas;
    }

    public String[] getNombresProveidos() {
        return nombresProveidos;
    }

    public void setNombresProveidos(String[] nombresProveidos) {
        this.nombresProveidos = nombresProveidos;
    }

    @Override
    public String toString() {
        return "gnu.service.Localidad{" +
                "caratulas=" + Arrays.toString(caratulas) +
                ", proveidos=" + Arrays.toString(proveidos) +
                ", nombresCaratulas=" + Arrays.toString(nombresCaratulas) +
                ", nombresProveidos=" + Arrays.toString(nombresProveidos) +
                ", name='" + name + '\'' +
                '}';
    }

    public static Localidad resistencia(){

        Localidad listasResistencia = new Localidad();

        String[] caratulas = {"listas/C_A_Civ_y_Com_Sala_I/Cam_Civ_Sala_I_",
                "listas/C_A_Civ_y_Com_Sala_II/Cam_Civ_Sala_II_",
                "listas/C_A_Civ_y_Com_Sala_III/Cam_Civ_Sala_III_",
                "listas/C_A_Civ_y_Com_Sala_IV/Cam_Civ_Sala_IV_",
                "listas/Camara_Cont_Admin/Camara_Cont_Adm_Sala_1_",
                "listas/Camara_Cont_Admin/Camara_Cont_Adm_Sala_2_",
                "listas/Camara_Laboral_Sala_I/Cam_Lab_Sala_I_",
                "listas/Camara_Laboral_Sala_II/Cam_Lab_Sala_II_",
                "listas/Juzgado_Civil_10/Juzgado_Civil_10_",
                "listas/Juzgado_Civil_11/Juzgado_Civil_11_",
                "listas/Juzgado_Civil_12/Juzgado_Civil_12_",
                "listas/Juzgado_Civil_13/Juzgado_Civil_13_",
                "listas/Juzgado_Civil_14/Juzgado_Civil_14_",
                "listas/Juzgado_Civil_15/Juzgado_Civil_15_",
                "listas/Juzgado_Civil_16/Juzgado_Civil_16_",
                "listas/Juzgado_Civil_17/Juzgado_Civil_17_",
                "listas/Juzgado_Civil_18/Juzgado_Civil_18_",
                "listas/Juzgado_Civil_19/Juzgado_Civil_19_",
                "listas/Juzgado_Civil_1/Juzgado_Civil_1_",
                "listas/Juzgado_Civil_20/Juzgado_Civil_20_",
                "listas/Juzgado_Civil_21/Juzgado_Civil_21_",
                "listas/Juzgado_Civil_22/Juzgado_Civil_22_",
                "listas/Juzgado_Civil_23/Juzgado_Civil_23_",
                "listas/Juzgado_Civil_2/Juzgado_Civil_2_",
                "listas/Juzgado_Civil_3/Juzgado_Civil_3_",
                "listas/Juzgado_Civil_4/Juzgado_Civil_4_",
                "listas/Juzgado_Civil_5/Juzgado_Civil_5_",
                "listas/Juzgado_Civil_6/Juzgado_Civil_6_",
                "listas/Juzgado_Civil_7/Juzgado_Civil_7_",
                "listas/Juzgado_Civil_8/Juzgado_Civil_8_",
                "listas/Juzgado_Civil_9/Juzgado_Civil_9_",
                "listas/Registro_Pub_Comercio/Reg_Publico_Comercio_",
                "listas/Juzgado_Notarial/Juzgado_Notarial_",
                "listas/Juzgado_Laboral_1/Juzgado_Laboral_1_",
                "listas/Juzgado_Laboral_2/Juzgado_Laboral_2_",
                "listas/Juzgado_Laboral_3/Juzgado_Laboral_3_",
                "listas/Juzgado_Laboral_4/Juzgado_Laboral_4_",
                "listas/Juzgado_M-y-Familia_1/Juzg_M-y-Familia_1_",
                "listas/Juzgado_M-y-Familia_2/Juzg_M-y-Familia_2_",
                "listas/Juzgado_M-y-Familia_5/Juzg_M-y-Familia_5_",
                "listas/Juzgado_M-y-Familia_6/Juzg_M-y-Familia_6_",
                "listas/Juzgado_M-y-Familia1_Sec_Soc/Juzg_M-y-F_SecSoc1_",
                "listas/Juzgado_M-y-Familia2_Sec_Soc/Juzg_M-y-F_SecSoc2_",
                "listas/Juzgado_M-y-Familia6_Sec_Soc/Juzg_M-y-F_SecSoc6_",
                "listas/Juzgado_Paz_1/Juzgado_Paz_1_",
                "listas/Juzgado_Paz_2/Juzgado_Paz_2_",
                "listas/Juzgado_Paz_Barranqueras/Juzgado_Paz_Barranqueras_",
                "listas/STJ_Sala_Primera/Sala_1_Civ-Com-Lab_",
                "listas/STJ_Sala_Segunda/Sala_2_Penal_",
                "listas/STJ_Sec_1_Cont-Adm/Sec_1_ContAdm_",
                "listas/STJ_Sec_2_Cont-Adm/Sec_2_ContAdm_",
                "listas/STJ_Sec_3_Asunt-Const/Sec_3_AsuntConst_"};

        String[] proveidos = {"listas/C_A_Civ_y_Com_Sala_I_Pro/Cam_Civ_Sala_I_Pro_",
                "listas/C_A_Civ_y_Com_Sala_II_Pro/Cam_Civ_Sala_II_Pro_",
                "listas/C_A_Civ_y_Com_Sala_III_Pro/Cam_Civ_Sala_III_Pro_",
                "listas/C_A_Civ_y_Com_Sala_IV_Pro/Cam_Civ_Sala_IV_Pro_",
                "listas/Camara_Cont_Admin_Pro/Camara_Cont_Adm_Sala_1_Pro_",
                "listas/Camara_Cont_Admin_Pro/Camara_Cont_Adm_Sala_2_Pro_",
                "listas/Camara_Laboral_Sala_I_Pro/Cam_Lab_Sala_I_Pro_",
                "listas/Camara_Laboral_Sala_II_Pro/Cam_Lab_Sala_II_Pro_",
                "listas/Juzgado_Civil_10_Pro/Juzgado_Civil_10_Pro_",
                "listas/Juzgado_Civil_11_Pro/Juzgado_Civil_11_Pro_",
                "listas/Juzgado_Civil_12_Pro/Juzgado_Civil_12_Pro_",
                "listas/Juzgado_Civil_13_Pro/Juzgado_Civil_13_Pro_",
                "listas/Juzgado_Civil_14_Pro/Juzgado_Civil_14_Pro_",
                "listas/Juzgado_Civil_15_Pro/Juzgado_Civil_15_Pro_",
                "listas/Juzgado_Civil_16_Pro/Juzgado_Civil_16_Pro_",
                "listas/Juzgado_Civil_17_Pro/Juzgado_Civil_17_Pro_",
                "listas/Juzgado_Civil_18_Pro/Juzgado_Civil_18_Pro_",
                "listas/Juzgado_Civil_19_Pro/Juzgado_Civil_19_Pro_",
                "listas/Juzgado_Civil_1_Pro/Juzgado_Civil_1_Pro_",
                "listas/Juzgado_Civil_20_Pro/Juzgado_Civil_20_Pro_",
                "listas/Juzgado_Civil_21_Pro/Juzgado_Civil_21_Pro_",
                "listas/Juzgado_Civil_22_Pro/Juzgado_Civil_22_Pro_",
                "listas/Juzgado_Civil_23_Pro/Juzgado_Civil_23_Pro_",
                "listas/Juzgado_Civil_2_Pro/Juzgado_Civil_2_Pro_",
                "listas/Juzgado_Civil_3_Pro/Juzgado_Civil_3_Pro_",
                "listas/Juzgado_Civil_4_Pro/Juzgado_Civil_4_Pro_",
                "listas/Juzgado_Civil_5_Pro/Juzgado_Civil_5_Pro_",
                "listas/Juzgado_Civil_6_Pro/Juzgado_Civil_6_Pro_",
                "listas/Juzgado_Civil_7_Pro/Juzgado_Civil_7_Pro_",
                "listas/Juzgado_Civil_8_Pro/Juzgado_Civil_8_Pro_",
                "listas/Juzgado_Civil_9_Pro/Juzgado_Civil_9_Pro_",
                "listas/Registro_Pub_Comercio_Pro/Reg_Publico_Comercio_Pro_",
                "listas/Juzgado_Notarial_Pro/Juzgado_Notarial_Pro_",
                "listas/Juzgado_Laboral_1_Pro/Juzgado_Laboral_1_Pro_",
                "listas/Juzgado_Laboral_2_Pro/Juzgado_Laboral_2_Pro_",
                "listas/Juzgado_Laboral_3_Pro/Juzgado_Laboral_3_Pro_",
                "listas/Juzgado_Laboral_4_Pro/Juzgado_Laboral_4_Pro_",
                "listas/Juzgado_Paz_1_Pro/Juzgado_Paz_1_Pro_",
                "listas/Juzgado_Paz_2_Pro/Juzgado_Paz_2_Pro_",
                "listas/Juzgado_Paz_Barranqueras/Juzgado_Paz_Barranqueras_Pro_",
                "listas/STJ_Sala_Primera_Pro/Sala_1_Civ-Com-Lab_Pro_",
                "listas/STJ_Sec_1_Cont-Adm_Pro/Sec_1_ContAdm_Pro_",
                "listas/STJ_Sec_2_Cont-Adm_Pro/Sec_2_ContAdm_Pro_",
                "listas/STJ_Sec_3_Asunt-Const_Pro/Sec_3_AsuntConst_Pro_"};

        String[] nombreArchivosCaratulas = {
                "Cam_Civ_Sala_I_",
                "Cam_Civ_Sala_II_",
                "Cam_Civ_Sala_III_",
                "Cam_Civ_Sala_IV_",
                "Camara_Cont_Adm_Sala_1_",
                "Camara_Cont_Adm_Sala_2_",
                "Cam_Lab_Sala_I_",
                "Cam_Lab_Sala_II_",
                "Juzgado_Civil_10_",
                "Juzgado_Civil_11_",
                "Juzgado_Civil_12_",
                "Juzgado_Civil_13_",
                "Juzgado_Civil_14_",
                "Juzgado_Civil_15_",
                "Juzgado_Civil_16_",
                "Juzgado_Civil_17_",
                "Juzgado_Civil_18_",
                "Juzgado_Civil_19_",
                "Juzgado_Civil_1_",
                "Juzgado_Civil_20_",
                "Juzgado_Civil_21_",
                "Juzgado_Civil_22_",
                "Juzgado_Civil_23_",
                "Juzgado_Civil_2_",
                "Juzgado_Civil_3_",
                "Juzgado_Civil_4_",
                "Juzgado_Civil_5_",
                "Juzgado_Civil_6_",
                "Juzgado_Civil_7_",
                "Juzgado_Civil_8_",
                "Juzgado_Civil_9_",
                "Reg_Publico_Comercio_",
                "Juzgado_Notarial_",
                "Juzgado_Laboral_1_",
                "Juzgado_Laboral_2_",
                "Juzgado_Laboral_3_",
                "Juzgado_Laboral_4_",
                "Juzg_M-y-Familia_1_",
                "Juzg_M-y-Familia_2_",
                "Juzg_M-y-Familia_5_",
                "Juzg_M-y-Familia_6_",
                "Juzg_M-y-F_SecSoc1_",
                "Juzg_M-y-F_SecSoc2_",
                "Juzg_M-y-F_SecSoc6_",
                "Juzgado_Paz_1_",
                "Juzgado_Paz_2_",
                "Juzgado_Paz_Barranqueras_",
                "Sala_1_Civ-Com-Lab_",
                "Sala_2_Penal_",
                "Sec_1_ContAdm_",
                "Sec_2_ContAdm_",
                "Sec_3_AsuntConst_"
        };

        String[] nombreArchivosProveidos = {
                "Cam_Civ_Sala_I_Pro_",
                "Cam_Civ_Sala_II_Pro_",
                "Cam_Civ_Sala_III_Pro_",
                "Cam_Civ_Sala_IV_Pro_",
                "Camara_Cont_Adm_Sala_1_Pro_",
                "Camara_Cont_Adm_Sala_2_Pro_",
                "Cam_Lab_Sala_I_Pro_",
                "Cam_Lab_Sala_II_Pro_",
                "Juzgado_Civil_10_Pro_",
                "Juzgado_Civil_11_Pro_",
                "Juzgado_Civil_12_Pro_",
                "Juzgado_Civil_13_Pro_",
                "Juzgado_Civil_14_Pro_",
                "Juzgado_Civil_15_Pro_",
                "Juzgado_Civil_16_Pro_",
                "Juzgado_Civil_17_Pro_",
                "Juzgado_Civil_18_Pro_",
                "Juzgado_Civil_19_Pro_",
                "Juzgado_Civil_1_Pro_",
                "Juzgado_Civil_20_Pro_",
                "Juzgado_Civil_21_Pro_",
                "Juzgado_Civil_22_Pro_",
                "Juzgado_Civil_23_Pro_",
                "Juzgado_Civil_2_Pro_",
                "Juzgado_Civil_3_Pro_",
                "Juzgado_Civil_4_Pro_",
                "Juzgado_Civil_5_Pro_",
                "Juzgado_Civil_6_Pro_",
                "Juzgado_Civil_7_Pro_",
                "Juzgado_Civil_8_Pro_",
                "Juzgado_Civil_9_Pro_",
                "Reg_Publico_Comercio_Pro_",
                "Juzgado_Notarial_Pro_",
                "Juzgado_Laboral_1_Pro_",
                "Juzgado_Laboral_2_Pro_",
                "Juzgado_Laboral_3_Pro_",
                "Juzgado_Laboral_4_Pro_",
                "Juzg_M-y-Familia_1_Pro_",
                "Juzg_M-y-Familia_2_Pro_",
                "Juzg_M-y-Familia_5_Pro_",
                "Juzg_M-y-Familia_6_Pro_",
                "Juzg_M-y-F_SecSoc1_Pro_",
                "Juzg_M-y-F_SecSoc2_Pro_",
                "Juzg_M-y-F_SecSoc6_Pro_",
                "Juzgado_Paz_1_Pro_",
                "Juzgado_Paz_2_Pro_",
                "Juzgado_Paz_Barranqueras_Pro_",
                "Sala_1_Civ-Com-Lab_Pro_",
                "Sala_2_Penal_Pro_",
                "Sec_1_ContAdm_Pro_",
                "Sec_2_ContAdm_Pro_",
                "Sec_3_AsuntConst_Pro_"
        };

        listasResistencia.setLinkCaratulas(caratulas);
        listasResistencia.setLinkProveidos(proveidos);
        listasResistencia.setNombresCaratulas(nombreArchivosCaratulas);
        listasResistencia.setNombresProveidos(nombreArchivosProveidos);

        listasResistencia.setName("Resistencia");

        return listasResistencia;
    }

    public static Localidad saenzP(){

        Localidad listasSP = new Localidad();

        String[] caratulas = {"listas/Saenz_Pena/Camara_Laboral_SP/cam_lab_SP_",
                "listas/Saenz_Pena/Cam_Civ_Sal_II_SP/cam_civ_sal_II_SP_",
                "listas/Saenz_Pena/Cam_Civ_Sal_I_SP/cam_civ_sal_I_SP_",
                "listas/Saenz_Pena/Juzgado_Civil_1_Sec1_SP/Juzg_Civ_1_Sec1_SP_",
                "listas/Saenz_Pena/Juzgado_Civil_1_Sec2_SP/Juzg_Civ_1_Sec2_SP_",
                "listas/Saenz_Pena/Juzgado_Civil_2_Sec3_SP/Juzg_Civ_2_Sec3_SP_",
                "listas/Saenz_Pena/Juzgado_Civil_2_Sec4_SP/Juzg_Civ_2_Sec4_SP_",
                "listas/Saenz_Pena/Juzgado_Laboral_02_SP/Juzgado_Laboral_2_SP_",
                "listas/Saenz_Pena/Juzgado_Laboral_SP/Juzgado_Laboral_SP_",
                "listas/Saenz_Pena/Juzgado_M-y-Familia_SP/Juzg_M_y_Familia_SP_",
                "listas/Saenz_Pena/Juzgado_Notarial_SP/Juzg_Notarial_SP_",
                "listas/Saenz_Pena/Juzgado_Paz_Sec1_SP/Juzg_Paz_Sec1_SP_",
                "listas/Saenz_Pena/Juzgado_Paz_Sec2_SP/Juzg_Paz_Sec2_SP_",
                "listas/Saenz_Pena/Juzgado_PECQ_SP/Juzg_pecq_SP_",
                "listas/Saenz_Pena/Registro_Pub_Comercio_SP/Reg_Publico_Comercio_SP_"};

        String[] proveidos = {"listas/Saenz_Pena/Camara_Laboral_SP/cam_lab_SP_Pro_",
                "listas/Saenz_Pena/Cam_Civ_Sal_II_SP/cam_civ_sal_II_SP_Pro_",
                "listas/Saenz_Pena/Cam_Civ_Sal_I_SP/cam_civ_sal_I_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Civil_1_Sec1_SP/Juzg_Civ_1_Sec1_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Civil_1_Sec2_SP/Juzg_Civ_1_Sec2_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Civil_2_Sec3_SP/Juzg_Civ_2_Sec3_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Civil_2_Sec4_SP/Juzg_Civ_2_Sec4_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Laboral_02_SP/Juzgado_Laboral_2_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Laboral_SP/Juzgado_Laboral_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Notarial_SP/Juzg_Notarial_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Paz_Sec1_SP/Juzg_Paz_Sec1_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_Paz_Sec2_SP/Juzg_Paz_Sec2_SP_Pro_",
                "listas/Saenz_Pena/Juzgado_PECQ_SP/Juzg_pecq_SP_Pro_",
                "listas/Saenz_Pena/Registro_Pub_Comercio_SP/Reg_Publico_Comercio_SP_Pro_"};

        String[] nombresCaratulas = {
                "cam_lab_SP_",
                "cam_civ_sal_II_SP_",
                "cam_civ_sal_I_SP_",
                "Juzg_Civ_1_Sec1_SP_",
                "Juzg_Civ_1_Sec2_SP_",
                "Juzg_Civ_2_Sec3_SP_",
                "Juzg_Civ_2_Sec4_SP_",
                "Juzgado_Laboral_2_SP_",
                "Juzgado_Laboral_SP_",
                "Juzg_M_y_Familia_SP_",
                "Juzg_Notarial_SP_",
                "Juzg_Paz_Sec1_SP_",
                "Juzg_Paz_Sec2_SP_",
                "Juzg_pecq_SP_",
                "Reg_Publico_Comercio_SP_"
        };

        String[] nombresProveidos = {
                "cam_lab_SP_Pro_",
                "cam_civ_sal_II_SP_Pro_",
                "cam_civ_sal_I_SP_Pro_",
                "Juzg_Civ_1_Sec1_SP_Pro_",
                "Juzg_Civ_1_Sec2_SP_Pro_",
                "Juzg_Civ_2_Sec3_SP_Pro_",
                "Juzg_Civ_2_Sec4_SP_Pro_",
                "Juzgado_Laboral_2_SP_Pro_",
                "Juzgado_Laboral_SP_Pro_",
                "Juzg_M_y_Familia_SP_Pro_",
                "Juzg_Notarial_SP_Pro_",
                "Juzg_Paz_Sec1_SP_Pro_",
                "Juzg_Paz_Sec2_SP_Pro_",
                "Juzg_pecq_SP_Pro_",
                "Reg_Publico_Comercio_SP_Pro_"
        };


        listasSP.setLinkCaratulas(caratulas);
        listasSP.setLinkProveidos(proveidos);
        listasSP.setNombresCaratulas(nombresCaratulas);
        listasSP.setNombresProveidos(nombresProveidos);

        listasSP.setName("SaenzPeña");

        return listasSP;
    }

    public static Localidad villaAngela()   {

        Localidad listasVillaAngela = new Localidad();

        String[] caratulas = {"listas/Villa_Angela/Juzgado_Civil_1/Juzg_Civil_1_V_Angela_",
                "listas/Villa_Angela/Juzgado_Civil_2/Juzg_Civil_2_V_Angela_",
                "listas/Villa_Angela/Juzgado_laboral/Juzg_Lab_V_Angela_",
                "listas/Villa_Angela/Juzgado_M-y-Familia/Juzg_M_y_Familia_VAngela_",
                "listas/Villa_Angela/Juzgado_Paz/Juzg_Paz_V_Angela_"};

        String[] proveidos = {"listas/Villa_Angela/Juzgado_Civil_1/Juzg_Civil_1_V_Angela_Pro_",
                "listas/Villa_Angela/Juzgado_Civil_2/Juzg_Civil_2_V_Angela_Pro_",
                "listas/Villa_Angela/Juzgado_laboral/Juzg_Lab_V_Angela_Pro_",
                "listas/Villa_Angela/Juzgado_Paz/Juzg_Paz_V_Angela_Pro_"};

        String[] nombreCaratulas = {
                "Juzg_Civil_1_V_Angela_",
                "Juzg_Civil_2_V_Angela_",
                "Juzg_Lab_V_Angela_",
                "Juzg_M_y_Familia_VAngela_",
                "Juzg_Paz_V_Angela_"};

        String[] nombreProveidos = {
                "Juzg_Civil_1_V_Angela_Pro_",
                "Juzg_Civil_2_V_Angela_Pro_",
                "Juzg_Lab_V_Angela_Pro_",
                "Juzg_M_y_Familia_VAngela_Pro_",
                "Juzg_Paz_V_Angela_Pro_"};

        listasVillaAngela.setLinkCaratulas(caratulas);
        listasVillaAngela.setLinkProveidos(proveidos);
        listasVillaAngela.setNombresCaratulas(nombreCaratulas);
        listasVillaAngela.setNombresProveidos(nombreProveidos);

        listasVillaAngela.setName("VillaAngela");

        return listasVillaAngela;
    }

    public static Localidad charata(){

        Localidad listasCharata = new Localidad();

        String[] caratulas = {
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_1_Charata_SecCivil_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecCivil_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecLab_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_1_Charata_SecLab_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_2_Charata_SecLab_",
                "listas/Charata/Juzgado_M-y-Familia/Familia_Civil_Charata_",
                "listas/Charata/Juzgado_M-y-Familia/Familia_Social_Charata_",
                "listas/Charata/Juzgado_Paz_CH/Juzgado_Paz_CH_",
                "listas/Charata/Registro_Pub_Comercio/RegistroPC_Charata_"
        };

        String[] proveidos = {
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_1_Charata_SecCivil_Pro_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecCivil_Pro_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Civil/JCCyL_2_Charata_SecLab_Pro_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_1_Charata_SecLab_Pro_",
                "listas/Charata/Juzgado_Civ_Lab_Sec_Laboral/JCCyL_2_Charata_SecLab_Pro_",
                "listas/Charata/Juzgado_Paz_CH/Juzgado_Paz_CH_Pro_",
                "listas/Charata/Registro_Pub_Comercio/RegistroPC_Charata_Pro_"
        };

        String[] nombreCaratulas = {
                "JCCyL_1_Charata_SecCivil_",
                "JCCyL_2_Charata_SecCivil_",
                "JCCyL_2_Charata_SecLab_",
                "JCCyL_1_Charata_SecLab_",
                "JCCyL_2_Charata_SecLab_",
                "Familia_Civil_Charata_",
                "Familia_Social_Charata_",
                "Juzgado_Paz_CH_",
                "RegistroPC_Charata_"
        };

        String[] nombreProveidos = {
                "JCCyL_1_Charata_SecCivil_Pro_",
                "JCCyL_2_Charata_SecCivil_Pro_",
                "JCCyL_2_Charata_SecLab_Pro_",
                "JCCyL_1_Charata_SecLab_Pro_",
                "JCCyL_2_Charata_SecLab_Pro_",
                "Familia_Civil_Charata_Pro_",
                "Familia_Social_Charata_Pro_",
                "Juzgado_Paz_CH_Pro_",
                "RegistroPC_Charata_Pro_"
        };


        listasCharata.setLinkCaratulas(caratulas);
        listasCharata.setLinkProveidos(proveidos);
        listasCharata.setNombresCaratulas(nombreCaratulas);
        listasCharata.setNombresProveidos(nombreProveidos);

        listasCharata.setName("Charata");

        return listasCharata;
    }

    public static Localidad sanMartin(){

        Localidad listasSanMartin = new Localidad();

        String[] caratulas = {
                "listas/San_Martin/Juzgado_Civ_Fam/Juzgado_Civ_Fam_",
                "listas/San_Martin/Juzgado_Civ_Lab/Juzgado_Civ_Lab_",
                "listas/San_Martin/Juzgado_Paz/Juzgado_Paz_"
        };

        String[] proveidos = {
                "listas/San_Martin/Juzgado_Civ_Lab/Juzgado_Civ_Lab_Pro_",
                "listas/San_Martin/Juzgado_Paz/Juzgado_Paz_Pro_"
        };

        String[] nombreCaratulas = {
                "Juzgado_Civ_Fam_",
                "Juzgado_Civ_Lab_",
                "Juzgado_Paz_"
        };

        String[] nombreProveidos = {
                "Juzgado_Civ_Lab_Pro_",
                "Juzgado_Paz_Pro_"
        };

        listasSanMartin.setLinkCaratulas(caratulas);
        listasSanMartin.setLinkProveidos(proveidos);
        listasSanMartin.setNombresCaratulas(nombreCaratulas);
        listasSanMartin.setNombresProveidos(nombreProveidos);

        listasSanMartin.setName("SanMartin");

        return listasSanMartin;
    }

    public static Localidad Castelli(){

        Localidad listasCastelli = new Localidad();

        String[] caratulas = {
                "listas/J_J_Castelli/Juzgado_Civil_JJC/JCCyL_Castelli_JuzgCivil_",
                "listas/J_J_Castelli/Juzgado_Familia_JJC/Juzgado_Familia_JJC_",
                "listas/J_J_Castelli/Juzgado_Laboral_JJC/JCCyL_Castelli_JuzgLab_",
                "listas/J_J_Castelli/Juzgado_Paz_JJC/Juzgado_Paz_JJC_"
        };

        String[] proveidos = {
                "listas/J_J_Castelli/Juzgado_Civil_JJC/JCCyL_Castelli_JuzgCivil_Pro_",
                "listas/J_J_Castelli/Juzgado_Laboral_JJC/JCCyL_Castelli_JuzgLab_Pro_",
                "listas/J_J_Castelli/Juzgado_Paz_JJC/Juzgado_Paz_JJC_Pro_"
        };

        String[] nombreCaratulas = {
                "JCCyL_Castelli_JuzgCivil_",
                "Juzgado_Familia_JJC_",
                "JCCyL_Castelli_JuzgLab_",
                "Juzgado_Paz_JJC_"
        };

        String[] nombreProveidos = {
                "JCCyL_Castelli_JuzgCivil_Pro_",
                "Juzgado_Familia_JJC_Pro_",
                "JCCyL_Castelli_JuzgLab_Pro_",
                "Juzgado_Paz_JJC_Pro_"
        };

        listasCastelli.setLinkCaratulas(caratulas);
        listasCastelli.setLinkProveidos(proveidos);
        listasCastelli.setNombresCaratulas(nombreCaratulas);
        listasCastelli.setNombresProveidos(nombreProveidos);

        listasCastelli.setName("Castelli");

        return listasCastelli;
    }


}