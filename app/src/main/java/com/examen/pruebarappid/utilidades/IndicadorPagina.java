package com.examen.pruebarappid.utilidades;
import android.support.v4.view.ViewPager;
/**
 * Created by choqu_000 on 01/02/2017.
 * Interface de la pagina del indicador
 * Un indicador de página es responsable de mostrar un indicador visual sobre el
 * número total de vistas y la vista visible actual.
 */

public interface IndicadorPagina extends ViewPager.OnPageChangeListener{
    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view
     */
    void setViewPager(ViewPager view);

    /**
     * Bind the indicator to a ViewPager.
     *
     * @param view
     * @param initialPosition
     */
    void setViewPager(ViewPager view, int initialPosition);

    /**
     * <p>Set the current page of both the ViewPager and indicator.</p>
     *
     * <p>This <strong>must</strong> be used if you need to set the page before
     * the views are drawn on screen (e.g., default start page).</p>
     *
     * @param item
     */
    void setCurrentItem(int item);

    /**
     * Set a page change listener which will receive forwarded events.
     *
     * @param listener
     */
    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    /**
     * Notify the indicator that the fragment list has changed.
     */
    void notifyDataSetChanged();
}
