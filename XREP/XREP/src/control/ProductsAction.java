package control;

import bean.Products;
import com.opensymphony.xwork2.ActionSupport;
import dao.newsDaoImpl;
import dao.productsDao;
import dao.productsDaoImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ProductsAction extends ActionSupport {
    private  int pid;
    private  String pname;
    private  String introduction;

    private List<Products> products;
    private HttpServletRequest request= ServletActionContext.getRequest();

    public  int getPid() {
        return pid;
    }
    public  void setPid(int pid) {
        this.pid = pid;
    }

    public  String getPname() {
        return pname;
    }
    public  void setPname(String pname) {
        this.pname = pname;
    }

    public  String getIntroduction() {
        return introduction;
    }
    public  void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    //添加产品
    public String execute1() throws Exception {
        request=ServletActionContext.getRequest();
        request.setCharacterEncoding("utf-8");
        productsDao selectProductsDao = new productsDaoImpl();
        Products products=new Products();
        products.setPname(request.getParameter("pname"));
        products.setIntroduction(request.getParameter("introduction"));
        boolean add=selectProductsDao.addProducts(products);
        if(add){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }


    //修改产品
    //查询所有产品id
    public String execute2() throws Exception {
        request = ServletActionContext.getRequest();
        productsDao dao = new productsDaoImpl();
        List list = dao.findAllProducts();
        request.getSession().setAttribute("allProductsId", list);
        return SUCCESS;
    }
    //按照id查找产品
    public String execute3() throws Exception{
        request=ServletActionContext.getRequest();
        productsDao selectId=new productsDaoImpl();
        pid= Integer.valueOf(request.getParameter("allProductsID"));
        Products list= (Products) selectId.idFindProducts(pid);
        request.getSession().setAttribute("selectProducts",list);
        return SUCCESS;
    }
    //修改产品
    public String execute5() throws Exception{
        request=ServletActionContext.getRequest();
        productsDao updateProductsDao=new productsDaoImpl();
        Products updateProducts=new Products();
        int pid= Integer.parseInt(request.getParameter("pid"));
        String pname=request.getParameter("pname");
        String introduction=request.getParameter("introduction");
        updateProducts.setPid(pid);
        updateProducts.setPname(pname);
        updateProducts.setIntroduction(introduction);
        boolean update=updateProductsDao.updateProducts(updateProducts);
        if(update){
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }

    //删除产品
    public String exectue6() throws Exception{
        productsDao delProductsDao=new productsDaoImpl();
        pid= Integer.valueOf(request.getParameter("allProductsId"));
        boolean delete=delProductsDao.deleteProducts(pid);
        if(delete) {
            execute4();
            return SUCCESS;
        }
        else return ERROR;
    }
    //查询所有产品
    public String execute4() throws Exception {
        request = ServletActionContext.getRequest();
        productsDao selectProductsDao = new productsDaoImpl();
        List list = selectProductsDao.findAllProducts();
        request.getSession().setAttribute("count", list.size());
        request.getSession().setAttribute("selectProducts", list);
        return SUCCESS;
    }

}
