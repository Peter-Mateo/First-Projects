

class Employee:
	def __init__(self, name, IDnumber, department, job_title):
		self.name = name
		self.IDnumber = IDnumber
		self.department = department
		self.job_title = job_title

	def set_name(self, name):
		self.name = name

	def set_IDnumber(self, id):
		self.id = id
	
	def set_department(self, department):
		self.department = department

	def set_job_title(self, job_title):
		self.job_title = job_title

	def get_name(self):
		return self.name

	def get_IDnumber(self):
		return self.id 
	
	def get_department(self):
		return self.department 

	def get_job_title(self):
		return self.job_title 