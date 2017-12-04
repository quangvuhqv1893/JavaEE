USE [User]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 12/1/2017 6:24:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Employee](
	[employeeID] [int] IDENTITY(1,1) NOT NULL,
	[firstName] [varchar](255) NULL,
	[lastName] [varchar](255) NULL,
	[phoneNumber] [varchar](255) NULL,
	[gender] [varchar](10) NULL,
	[description] [varchar](255) NULL,
	[vehicle] [varchar](10) NULL,
	[way] [varchar](10) NULL,
	[img] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[employeeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
