Feature: Data Table Validation

  Scenario: verify data table
    Given user open data table website
    Then verify following table data displayed on homepage
    Then get the table data from website
    Given table data from feature file
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 11/28/2008 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 10/9/2009  |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 1/12/2009  |
      | Bradley Greer      | Software Engineer             | London        | 41 | 10/13/2012 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 6/7/2011   |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 12/2/2012  |
      | Bruno Nash         | Software Engineer             | London        | 38 | 5/3/2011   |
      | Caesar Vance       | Pre-Sales Support             | New York      | 21 | 12/12/2011 |
      | Cara Stevens       | Sales Assistant               | New York      | 46 | 12/6/2011  |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     | 22 | 3/29/2012  |
    Then lets compare two list