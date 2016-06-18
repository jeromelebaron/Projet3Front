package fr.s2re.managedbean;

import javax.annotation.PostConstruct;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.ChartSeries;

import fr.s2re.bigdata.backend.mongo.dao.impl.DaoConnexion;
import fr.s2re.bigdata.backend.mongo.idao.IDaoConnexion;
import fr.s2re.bigdata.backend.wrapper.ConnexionRegionWrapper;

@ManagedBean
public class ChartView implements Serializable {

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = 1L;

    private BarChartModel barModel;

    private HorizontalBarChartModel horizontalBarModel;
    /**
     * La liste des connexions par région.
     */
    private List<ConnexionRegionWrapper> connexionParRegion;
    /**
     * Pour récupérer les connexions.
     */
    private IDaoConnexion daoConnexion = new DaoConnexion();

    @PostConstruct
    public void init() {
        connexionParRegion = daoConnexion.getConnexionQteConnexionByRegion();
        createBarModels();
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
        int max = 0;
        int min = connexionParRegion.get(0).getQteConnexion();
        final ChartSeries region = new ChartSeries();
        region.setLabel("Région");
        for (ConnexionRegionWrapper localConnexionRegionWrapper : connexionParRegion) {
            region.set(localConnexionRegionWrapper.getNomRegion().substring(0, 4),
                    localConnexionRegionWrapper.getQteConnexion());
            if (localConnexionRegionWrapper.getQteConnexion() > max) {
                max = localConnexionRegionWrapper.getQteConnexion();
            }
            if (localConnexionRegionWrapper.getQteConnexion() < min) {
                min = localConnexionRegionWrapper.getQteConnexion();
            }
        }
        model.addSeries(region);
        Axis axisY = model.getAxis(AxisType.Y);
        axisY.setMin(min / 2);
        axisY.setMax(max + min);
        return model;
    }

    private void createBarModels() {
        createBarModel();
    }

    private void createBarModel() {
        barModel = initBarModel();

        barModel.setTitle("Nombre de connexions par régions");
        barModel.setLegendPosition("n");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Région");
    }

    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 50);
        boys.set("2005", 96);
        boys.set("2006", 44);
        boys.set("2007", 55);
        boys.set("2008", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("2004", 52);
        girls.set("2005", 60);
        girls.set("2006", 82);
        girls.set("2007", 35);
        girls.set("2008", 120);

        horizontalBarModel.addSeries(boys);
        horizontalBarModel.addSeries(girls);

        horizontalBarModel.setTitle("Horizontal and Stacked");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);

        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(200);

        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Gender");
    }

}
