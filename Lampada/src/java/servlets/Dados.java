package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String CorI_txt,CaracTec_txt,Beneficios_txt,CodFornecedor_txt,CodBarras_txt,Voltagem_txt,PotenciaI_txt,PotenciaII_txt,Formato_txt;
        String TipoSoquete_txt,CorII_txt,Reator_txt,AmbUso_txt,FormatoLampada_txt,CorLuz_txt,PotenciaLampada_txt,QntIlumina_txt,Tensao_txt;
        String Altura_txt,Comprimento_txt,Largura_txt,Massa_txt;
        
        CorI_txt = request.getParameter("cor1");
        CaracTec_txt = request.getParameter("carac_tec");
        Beneficios_txt = request.getParameter("beneficios");
        CodFornecedor_txt = request.getParameter("cod_fornecedor");
        CodBarras_txt = request.getParameter("cod_barras");
        Voltagem_txt = request.getParameter("voltagem");
        PotenciaI_txt = request.getParameter("potenciaI");
        PotenciaII_txt = request.getParameter("potenciaII");
        Formato_txt = request.getParameter("formato");
        TipoSoquete_txt = request.getParameter("tipo_soquete");
        CorII_txt = request.getParameter("cor2");
        Reator_txt = request.getParameter("reator");
        AmbUso_txt = request.getParameter("amb_uso");
        FormatoLampada_txt = request.getParameter("formato_lampada");
        CorLuz_txt = request.getParameter("cor_luz");
        PotenciaLampada_txt = request.getParameter("potencia_lampada");
        QntIlumina_txt = request.getParameter("qnt_ilumina");
        Tensao_txt = request.getParameter("tensao");
        Altura_txt = request.getParameter("altura");
        Comprimento_txt = request.getParameter("comprimento");
        Largura_txt = request.getParameter("largura");
        Massa_txt = request.getParameter("massa");
        
        int Massa,P1,P2,P3,QntdDeLuz,U,Volt;
        float Altura,Comprimento,Largura;
        long CodigoFornecedor,CodigoBarras;
        
        Massa = Integer.parseInt(Massa_txt);
        P1 = Integer.parseInt(PotenciaI_txt);
        P2 = Integer.parseInt(PotenciaII_txt);
        P3 = Integer.parseInt(PotenciaLampada_txt);
        QntdDeLuz = Integer.parseInt(QntIlumina_txt);
        U = Integer.parseInt(Tensao_txt);
        Volt = Integer.parseInt(Voltagem_txt);
        
        Altura = Float.parseFloat(Altura_txt);
        Comprimento = Float.parseFloat(Comprimento_txt);
        Largura = Float.parseFloat(Largura_txt);
        
        CodigoFornecedor = Long.parseLong(CodFornecedor_txt);
        CodigoBarras = Long.parseLong(CodBarras_txt);
        
        request.setAttribute("PrimeiraCor_txt", CorI_txt);
        request.setAttribute("CaracTec_txt", CaracTec_txt);
        request.setAttribute("Beneficios_txt", Beneficios_txt);
        request.setAttribute("CodigoFornecedor", CodigoFornecedor);
        request.setAttribute("CodigoBarras", CodigoBarras);
        request.setAttribute("Volt_txt", Volt);
        request.setAttribute("P1", P1);
        request.setAttribute("P2", P2);
        request.setAttribute("Formato_txt", Formato_txt);
        request.setAttribute("TipoSoquete_txt", TipoSoquete_txt);
        request.setAttribute("SegundaCor_txt", CorII_txt);
        request.setAttribute("Reator_txt", Reator_txt);
        request.setAttribute("AmbUso_txt", AmbUso_txt);
        request.setAttribute("FormatoLampada_txt", FormatoLampada_txt);
        request.setAttribute("CorLuz_txt", CorLuz_txt);
        request.setAttribute("P3", P3);
        request.setAttribute("QntdDeLuz", QntdDeLuz);
        request.setAttribute("U", U);
        request.setAttribute("Altura", Altura);
        request.setAttribute("Comprimento", Comprimento);
        request.setAttribute("Largura", Largura);
        request.setAttribute("Massa", Massa);
        
        request.getRequestDispatcher("other.jsp").forward(request, response);
    }
}
