package controllers;

import java.util.ArrayList;
import java.util.List;

import models.StockItem;

import org.apache.commons.lang.StringUtils;

import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Product extends Controller {
 
  public static List<StockItem> getStockItems() {
	List<StockItem> stockItems = new ArrayList();
	models.Product p = new models.Product();
	p.name = "Stainless steel paperclips";
	StockItem s = new StockItem();
	s.product = p;
	s.quantity = new Long(120);
	stockItems.add(s);
	p = new models.Product();
	p.name = "Plastic paperclips";
	s = new StockItem();
	s.product = p;
	s.quantity = new Long(190);
	stockItems.add(s);
	p = new models.Product();
	p.name = "Red color paperclips";
	s = new StockItem();
	s.product = p;
	s.quantity = new Long(200);
	stockItems.add(s);
	return stockItems;
  }

  public static Result list(Long warehouseId) {
	List<StockItem> stockItems = getStockItems();
	return ok(StringUtils.join(stockItems, "\n"));
  }
  
} 