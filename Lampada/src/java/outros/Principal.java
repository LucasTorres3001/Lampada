package outros;


public class Principal {
    
    private String PrimeiraCor,CaracteristicasTecnicas,Beneficios,Formato,TipoSoquete,SegundaCor;
    private String Reator,AmbienteDeUso,FormatoDaLampada,CorDaLuz;
    private int DDP,m,PotI,PotII,PotDaLampada,QuantoIlumina,Voltagem;
    private float Height,leng,width;
    private long CodDeBarras,CodDoFornecedor;

    public String getPrimeiraCor() {
        return PrimeiraCor;
    }

    public void setPrimeiraCor(String PrimeiraCor) {
        this.PrimeiraCor = PrimeiraCor;
    }

    public String getCaracteristicasTecnicas() {
        return CaracteristicasTecnicas;
    }

    public void setCaracteristicasTecnicas(String CaracteristicasTecnicas) {
        this.CaracteristicasTecnicas = CaracteristicasTecnicas;
    }

    public String getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getTipoSoquete() {
        return TipoSoquete;
    }

    public void setTipoSoquete(String TipoSoquete) {
        this.TipoSoquete = TipoSoquete;
    }

    public String getSegundaCor() {
        return SegundaCor;
    }

    public void setSegundaCor(String SegundaCor) {
        this.SegundaCor = SegundaCor;
    }

    public String getReator() {
        return Reator;
    }

    public void setReator(String Reator) {
        this.Reator = Reator;
    }

    public String getAmbienteDeUso() {
        return AmbienteDeUso;
    }

    public void setAmbienteDeUso(String AmbienteDeUso) {
        this.AmbienteDeUso = AmbienteDeUso;
    }

    public String getFormatoDaLampada() {
        return FormatoDaLampada;
    }

    public void setFormatoDaLampada(String FormatoDaLampada) {
        this.FormatoDaLampada = FormatoDaLampada;
    }

    public String getCorDaLuz() {
        return CorDaLuz;
    }

    public void setCorDaLuz(String CorDaLuz) {
        this.CorDaLuz = CorDaLuz;
    }

    public int getDDP() {
        return DDP;
    }

    public void setDDP(int DDP) {
        this.DDP = DDP;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getPotI() {
        return PotI;
    }

    public void setPotI(int PotI) {
        this.PotI = PotI;
    }

    public int getPotII() {
        return PotII;
    }

    public void setPotII(int PotII) {
        this.PotII = PotII;
    }

    public int getPotDaLampada() {
        return PotDaLampada;
    }

    public void setPotDaLampada(int PotDaLampada) {
        this.PotDaLampada = PotDaLampada;
    }

    public int getQuantoIlumina() {
        return QuantoIlumina;
    }

    public void setQuantoIlumina(int QuantoIlumina) {
        this.QuantoIlumina = QuantoIlumina;
    }

    public int getVoltagem() {
        return Voltagem;
    }

    public void setVoltagem(int Voltagem) {
        this.Voltagem = Voltagem;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public float getLeng() {
        return leng;
    }

    public void setLeng(float leng) {
        this.leng = leng;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public long getCodDeBarras() {
        return CodDeBarras;
    }

    public void setCodDeBarras(long CodDeBarras) {
        this.CodDeBarras = CodDeBarras;
    }

    public long getCodDoFornecedor() {
        return CodDoFornecedor;
    }

    public void setCodDoFornecedor(long CodDoFornecedor) {
        this.CodDoFornecedor = CodDoFornecedor;
    }
    
    public String GetInfo(){
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "<th>Descricão</th>";
        Dados += "<tr>";
        Dados += "<th>Cor</th>";
        Dados += "<td>" + getPrimeiraCor() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Características Técnicas</th>";
        Dados += "<td>" + getCaracteristicasTecnicas() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Beneficios</th>";
        Dados += "<td>" + getBeneficios() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Código do fornecedor</th>";
        Dados += "<td>" + getCodDoFornecedor() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Código de Barras</th>";
        Dados += "<td>" + getCodDeBarras() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Voltagem</th>";
        Dados += "<td>" + getVoltagem() + " V</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Potência</th>";
        Dados += "<td>" + getPotI() + " W á " + getPotII() + " W</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Formato</th>";
        Dados += "<td>" + getFormato() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Tipo de Soquete</th>";
        Dados += "<td>" + getTipoSoquete() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Cor</th>";
        Dados += "<td>" + getSegundaCor() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Reator</th>";
        Dados += "<td>" + getReator() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Ambiente de Uso</th>";
        Dados += "<td>" + getAmbienteDeUso() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Formato da lâmpada</th>";
        Dados += "<td>" + getFormatoDaLampada() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Cor da luz</th>";
        Dados += "<td>" + getCorDaLuz() + "</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Potência da Lâmpada</th>";
        Dados += "<td>" + getPotDaLampada() + " W</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Quanto Ilumina</th>";
        Dados += "<td>" + getQuantoIlumina() + " lm</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Tensão da Lâmpada</th>";
        Dados += "<td>" + getDDP() + " V</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Altura</th>";
        Dados += "<td>" + getHeight() + " cm</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Comprimento</th>";
        Dados += "<td>" + getLeng() + " cm</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Largura</th>";
        Dados += "<td>" + getWidth() + " cm</td>";
        Dados += "</tr>";
        Dados += "<tr>";
        Dados += "<th>Massa</th>";
        Dados += "<td>" + getM() + " g</td>";
        Dados += "</tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
