

from distutils.command.build_scripts import first_line_re


class CodingDojo:
	def __init__(self, first_name, last_name, IDnumber, language):
		self.first_name = first_name
		self.last_name = last_name
		self.IDnumber = IDnumber
		self.language = language

	def fname_change(self, fname):
		self.first_name = fname

	def lname_change(self, lname):
		self.last_name = lname

	def IDnumber(self, IDnumber):
		self.IDnumber = IDnumber

	def change_language(self, language):
		self.language = language

	def get_fname(self):
		return self.first_name

	def get_lname(self):
		return self.last_name 

	def get_IDnumber(self):
		return self.IDnumber 

	def get_language(self):
		return self.language 

	#Print out the Student 
	def Student_Info(self):
		print("Student: " + self.first_name + " " + self.last_name + 
				"\n ID: "+ str(self.IDnumber) +
		"\n Language: "+ self.language)

"""
leo = CodingDojo("Leonardo", "Mateo", 305131, "English")

leo.Student_Info()

print("--" * 15)

leo.IDnumber = 305127

leo.Student_Info()
"""