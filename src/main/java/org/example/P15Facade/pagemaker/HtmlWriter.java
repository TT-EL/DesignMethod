package org.example.P15Facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

// 习题15-1 删除public关键字后，外部类（Main）就无法访问到了
class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    // 生成超链接
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption +"</a>");
    }

    // 生成邮件地址
    public void mailto(String mailAddress, String username) throws IOException {
        link("mailto:"+ mailAddress, username);
    }

    // 结束输出
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
