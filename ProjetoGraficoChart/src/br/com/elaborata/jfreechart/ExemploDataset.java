/**
 * 
 */
package br.com.elaborata.jfreechart;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * @author aluno
 *
 */
public class ExemploDataset extends ApplicationFrame{
	
	private static final long serialVersionUID = 1L;

	public ExemploDataset(String title) {
		
		super(title);
		final CategoryDataset dataset = createDataset();
		final JFreeChart grafico = createChart(dataset);
		final ChartPanel painelGrafico = new ChartPanel(grafico);
		painelGrafico.setPreferredSize(new Dimension(800, 250));
		
		setContentPane(painelGrafico);
		
		
	}

	
	/**
	 * Cria e mostra um grafico com valores
	 * 
	 * @param dataset
	 * @return grafico
	 * 
	 */
	private JFreeChart createChart(CategoryDataset dataset) {
		
		//Criando o grafico
		final JFreeChart chart = ChartFactory.createLineChart("Meu Grafrico", "Dia", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		chart.setBackgroundPaint(Color.green);
		
		final CategoryPlot plot = (CategoryPlot) chart.getPlot();
		
		plot.setBackgroundPaint(Color.lightGray);
		plot.setRangeGridlinePaint(Color.yellow);
		
		// customisando o range
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(true);
		
		//Customizar o renderer
		final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
//		renderer.setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		
		
		return chart;
		
	}
	
	public static void main(String[] args) {
		
		final ExemploDataset exemploDataset = new ExemploDataset("Exemplo do Slide");
		
		exemploDataset.pack();
		RefineryUtilities.centerFrameOnScreen(exemploDataset);
		exemploDataset.setVisible(true);
		
	}
	
	/**
	 * Cria um conjunto de dados para amostra
	 *  
	 * @return dataset
	 */
	public CategoryDataset createDataset() {
		
			//Chave da linha
			final String valor = "Maximo";
			//Chaves de coluna
			final String dia1 = "Dia 1";
			final String dia2 = "Dia 2";
			final String dia3 = "Dia 3";
			final String dia4 = "Dia 4";
			final String dia5 = "Dia 5";
			final String dia6 = "Dia 6";
			final String dia7 = "Dia 7";
			final String dia8 = "Dia 8";
			final String dia9 = "Dia 9";
			final String dia10 = "Dia 10";
			
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			
			ds.addValue(40.5, valor, dia1);
			ds.addValue(38.2, valor, dia2);
			ds.addValue(37.3, valor, dia3);
			ds.addValue(31.5, valor, dia4);
			ds.addValue(35.7, valor, dia5);
			ds.addValue(42.5, valor, dia6);
			ds.addValue(45.5, valor, dia7);
			ds.addValue(48.1, valor, dia8);
			ds.addValue(0, valor, dia9);
			ds.addValue(1, valor, dia10);
		
			return ds;
			
	}
	
	
	
	
}
