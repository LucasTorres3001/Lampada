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
        
        request.setAttribute("PrimeiraCor_txt", CorI_txt);
        request.setAttribute("CaracTec_txt", CaracTec_txt);
        request.setAttribute("Beneficios_txt", Beneficios_txt);
        request.setAttribute("CodigoFornecedor", CodFornecedor_txt);
        request.setAttribute("CodigoBarras", CodBarras_txt);
        request.setAttribute("Volt_txt", Voltagem_txt);
        request.setAttribute("P1", PotenciaI_txt);
        request.setAttribute("P2", PotenciaII_txt);
        request.setAttribute("Formato_txt", Formato_txt);
        request.setAttribute("TipoSoquete_txt", TipoSoquete_txt);
        request.setAttribute("SegundaCor_txt", CorII_txt);
        request.setAttribute("Reator_txt", Reator_txt);
        request.setAttribute("AmbUso_txt", AmbUso_txt);
        request.setAttribute("FormatoLampada_txt", FormatoLampada_txt);
        request.setAttribute("CorLuz_txt", CorLuz_txt);
        request.setAttribute("P3", PotenciaLampada_txt);
        request.setAttribute("QntdDeLuz", QntIlumina_txt);
        request.setAttribute("U", Tensao_txt);
        request.setAttribute("Altura", Altura_txt);
        request.setAttribute("Comprimento", Comprimento_txt);
        request.setAttribute("Largura", Largura_txt);
        request.setAttribute("Massa", Massa_txt);
        
        request.getRequestDispatcher("other.jsp").forward(request, response);
    }
}
