class Faculty extends Employee{
	private String job;
		public void setjob(String job){
			this.job=job;
		}
		public String getjob(){
			System.out.println("job=="+job);
			return null;
		}
	}