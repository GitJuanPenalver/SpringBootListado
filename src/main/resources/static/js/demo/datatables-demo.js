// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#dataTable').DataTable();
});

function eliminarUsuario(id){
        alert(id);
    }
    
async function cargarUsuarios(){

   const request = await fetch('usuario', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  
  const content = await request.json();
  let listadoHtml = '';
  let tt = '';
  for (let usuario of content){
        tt = '<a href=""  onclick="eliminarUsuario(+'usuario.id'+)" class="btn btn-danger btn-circle btn-sm" ><i class="fas fa-trash"></i></a>';

        usuariohtml ='<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+" "+ usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td>'+ tt +'</td></tr>';
        listadoHtml += usuariohtml;
    }
  console.log(content);
  document.querySelector('table tbody').outerHTML = listadoHtml;
    
}



