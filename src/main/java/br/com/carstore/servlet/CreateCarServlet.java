package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String name = request.getParameter("name");

        Car car = new Car();
        car.setName(name);

        CarDAO dao = new CarDAO();
        dao.createCar(car);

       resp.sendRedirect("/find-all-cars");

    }

}
