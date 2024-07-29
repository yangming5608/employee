import request from '@/utils/request'


export default {
    //1.（查询分页）
    getDepartmentListPage(current, limit) {
      return request({
        url: `/employee/department/listPage/${current}/${limit}`,
        method: "get"
      })
    },
    //2.删除
    deleteDepartmentById(id) {
      return request({
        url: `/employee/department/${id}`,
        method: "delete"
      })
    },
    //3.添加
    addDepartment(department) {
      return request({
        url: `/employee/department`,
        method: "post",
        data: department
      })
    },
    //4.根据id查询
    getDepartmentById(id) {
      return request({
        url: `/employee/department/${id}`,
        method: "get"
      })
    },
    //修改
    updateDepartment(department) {
      return request({
        url: `/employee/department`,
        method: "put",
        data: department
      })
    },
    //查询所有
    getDepartmentList() {
        return request({
          url: `/employee/department/list`,
          method: "get"
        })
      },
  }

