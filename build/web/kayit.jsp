<%-- 
    Document   : kayit
    Created on : 13.Ara.2018, 14:10:27
    Author     : RAMAZHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>JSP Page</title>
    
    <style>
        
        .input-group-addon.primary {
    color: rgb(255, 255, 255);
    background-color: rgb(50, 118, 177);
    border-color: rgb(40, 94, 142);
}
.input-group-addon.success {
    color: rgb(255, 255, 255);
    background-color: rgb(92, 184, 92);
    border-color: rgb(76, 174, 76);
}
.input-group-addon.info {
    color: rgb(255, 255, 255);
    background-color: rgb(57, 179, 215);
    border-color: rgb(38, 154, 188);
}
.input-group-addon.warning {
    color: rgb(255, 255, 255);
    background-color: rgb(240, 173, 78);
    border-color: rgb(238, 162, 54);
}
.input-group-addon.danger {
    color: rgb(255, 255, 255);
    background-color: rgb(217, 83, 79);
    border-color: rgb(212, 63, 58);
}
        
    </style>
</head>
  
<body>
    <%@include file="header.jsp" %>
   <div class="container">
	<div class="row" style="margin-top: 50px; margin-left: 80px;">
		<h2>Üyelik Formu</h2>
	</div>
    
    <div class="row" style="margin-top: 10px;margin-bottom: 20px;">
        <div class="col-sm-offset-4 col-sm-4">
            <form method="POST" action="kayitekle.jsp">
				<div class="form-group" >
        			<label for="validate-text">Ad Soyad</label>
					<div class="input-group" data-validate="name">
						<input type="text" class="form-control" name="validate-text" id="validate-text" placeholder="ör. Kemal Güven" required>
						<span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
					</div>
				</div>
				<div class="form-group">
        			<label for="validate-email">E-posta</label>
					<div class="input-group" data-validate="email">
						<input type="text" class="form-control" name="validate-email" id="validate-email" placeholder="ör. email@gmail.com" required>
						<span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
					</div>
				</div>
                         
                                
                
                                
    			<div class="form-group">
        			<label for="validate-phone">Cep Telefonu</label>
					<div class="input-group" data-validate="phone">
						<input type="text" class="form-control" name="validate-phone" id="validate-phone" placeholder="ör. 5xxxxxxxxx" required>
						<span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
					</div>
				</div>
                <div class="form-group">
            		<label for="validate-select">Hesap Türü</label>
					<div class="input-group">
                        <select class="form-control" name="validate-select" id="validate-select" placeholder="Kişisel yada Emlak Ofisi" required>
                            <option value="">Seçiniz</option>
                            <option value="Yazar">Makale Yazari</option>
                            <option value="Hakem">Hakem</option>
                            <option value="Editor">Editör</option>
                        </select>
						<span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
					</div>
				</div>
                <button type="submit" class="btn btn-primary col-xs-12" disabled>Gönder</button>
            </form>
        </div>
    </div>
</div>
    
 <script>
     $(document).ready(function() {
    $('.input-group input[required], .input-group textarea[required], .input-group select[required]').on('keyup change', function() {
		var $form = $(this).closest('form'),
            $group = $(this).closest('.input-group'),
			$addon = $group.find('.input-group-addon'),
			$icon = $addon.find('span'),
			state = false;
            
    	if (!$group.data('validate')) {
			state = $(this).val() ? true : false;
		}else if ($group.data('validate') == "name") {
    		state = /^([a-zA-Z]){2,}\s([a-zA-Z]){2,}$/.test($(this).val())
		}else if ($group.data('validate') == "email") {
			state = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test($(this).val())
		}else if($group.data('validate') == 'phone') {
			state = /^[(]{0,1}[0-9]{3}[)]{0,1}[-\s\.]{0,1}[0-9]{3}[-\s\.]{0,1}[0-9]{4}$/.test($(this).val())
		}else if ($group.data('validate') == "length") {
			state = $(this).val().length >= $group.data('length') ? true : false;
		}else if ($group.data('validate') == "number") {
			state = !isNaN(parseFloat($(this).val())) && isFinite($(this).val());
		}

		if (state) {
				$addon.removeClass('danger');
				$addon.addClass('success');
				$icon.attr('class', 'glyphicon glyphicon-ok');
		}else{
				$addon.removeClass('success');
				$addon.addClass('danger');
				$icon.attr('class', 'glyphicon glyphicon-remove');
		}
        
        if ($form.find('.input-group-addon.danger').length == 0) {
            $form.find('[type="submit"]').prop('disabled', false);
        }else{
            $form.find('[type="submit"]').prop('disabled', true);
        }
	});
    
    $('.input-group input[required], .input-group textarea[required], .input-group select[required]').trigger('change');
    
    
});
     
     
     
 </script>


    
</body>

 <%@include file="footer.jsp" %>
 
 

</html>
