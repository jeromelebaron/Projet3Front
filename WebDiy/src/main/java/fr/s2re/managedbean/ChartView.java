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
        model.setAnimate(true);
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
        axisY.setLabel("Nb de connexions");
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

}
