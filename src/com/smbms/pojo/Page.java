package com.smbms.pojo;

import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = 4714496261231481483L;

	private int size;//每页信息条数
		private int totalCount;//总信息条数
		private int totalPage;//总页数
		private int currentpage;//当前页
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
			if(totalCount%size==0){
				this.totalPage=totalCount/size;
			}else{
				this.totalPage=totalCount/size+1;
			}
		}
		public int getTotalPage() {
			return totalPage;
		}
		public int getCurrentpage() {
			return currentpage;
		}
		public void setCurrentpage(int currentpage) {
			this.currentpage = currentpage;
		}
		
}
