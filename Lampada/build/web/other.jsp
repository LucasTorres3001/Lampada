<%@page import="outros.Principal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String a,b,c,d,e,f,g,h,i,j,k,l;
            
            a = request.getAttribute("CodigoFornecedor").toString();
            b = request.getAttribute("CodigoBarras").toString();
            c = request.getAttribute("Volt_txt").toString();
            d = request.getAttribute("P1").toString();
            e = request.getAttribute("P2").toString();
            f = request.getAttribute("P3").toString();
            g = request.getAttribute("QntdDeLuz").toString();
            h = request.getAttribute("U").toString();
            i = request.getAttribute("Altura").toString();
            j = request.getAttribute("Comprimento").toString();
            k = request.getAttribute("Largura").toString();
            l = request.getAttribute("Massa").toString();
            
            String PrimeiraCor,CaracteristicasTecnicas,Beneficios,Formato,TipoSoquete,SegundaCor;
            String Reator,AmbienteDeUso,FormatoDaLampada,CorDaLuz;
            int DDP,m,PotI,PotII,PotDaLampada,QuantoIlumina,Voltagem;
            float Height,Leng,Width;
            long CodDeBarras,CodDoFornecedor;
            
            
            PrimeiraCor = request.getAttribute("PrimeiraCor_txt").toString();
            CaracteristicasTecnicas = request.getAttribute("CaracTec_txt").toString();
            Beneficios = request.getAttribute("Beneficios_txt").toString();
            Formato = request.getAttribute("Formato_txt").toString();
            TipoSoquete = request.getAttribute("TipoSoquete_txt").toString();
            SegundaCor = request.getAttribute("SegundaCor_txt").toString();
            Reator = request.getAttribute("Reator_txt").toString();
            AmbienteDeUso = request.getAttribute("AmbUso_txt").toString();
            FormatoDaLampada = request.getAttribute("FormatoLampada_txt").toString();
            CorDaLuz = request.getAttribute("CorLuz_txt").toString();
            
            
            DDP = Integer.parseInt(h);
            m = Integer.parseInt(l);
            PotI = Integer.parseInt(d);
            PotII = Integer.parseInt(e);
            PotDaLampada = Integer.parseInt(f);
            QuantoIlumina = Integer.parseInt(g);
            Voltagem = Integer.parseInt(c);
            Height = Float.parseFloat(i);
            Leng = Float.parseFloat(j);
            Width = Float.parseFloat(k);
            CodDeBarras = Long.parseLong(b);
            CodDoFornecedor = Long.parseLong(a);
            
            Principal home = new Principal();
            
            home.setPrimeiraCor(PrimeiraCor);
            home.setAmbienteDeUso(AmbienteDeUso);
            home.setBeneficios(Beneficios);
            home.setCaracteristicasTecnicas(CaracteristicasTecnicas);
            home.setCodDeBarras(CodDeBarras);
            home.setCodDoFornecedor(CodDoFornecedor);
            home.setCorDaLuz(CorDaLuz);
            home.setDDP(DDP);
            home.setFormato(Formato);
            home.setFormatoDaLampada(FormatoDaLampada);
            home.setHeight(Height);
            home.setLeng(Leng);
            home.setM(m);
            home.setPotDaLampada(PotDaLampada);
            home.setPotI(PotI);
            home.setPotII(PotII);
            home.setSegundaCor(SegundaCor);
            home.setQuantoIlumina(QuantoIlumina);
            home.setReator(Reator);
            home.setTipoSoquete(TipoSoquete);
            home.setVoltagem(Voltagem);
            home.setWidth(Width);
            
            out.print(home.GetInfo());
            
        %>
    </body>
</html>
