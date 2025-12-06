package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataTableReference: ImageVector
    get() {
        val current = _dataTableReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataTableReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 8.586 22
                lineTo(x = 8.586f, y = 22.0f)
                // L 2 28.586
                lineTo(x = 2.0f, y = 28.586f)
                // L 3.414 30
                lineTo(x = 3.414f, y = 30.0f)
                // L 10 23.414
                lineTo(x = 10.0f, y = 23.414f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 4 20z
                lineTo(x = 4.0f, y = 20.0f)
                close()
            }
            // <rect width="4" height="2" x="20.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 22
                moveTo(x = 20.0f, y = 22.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="16.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="20.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 14
                moveTo(x = 20.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="8.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M27 3 H5 a2 2 0 0 0 -2 2 v11 h2 v-5 h22 v16 H16 v2 h11 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6 H5 V5 h22Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 3
                moveTo(x = 27.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 22z
                horizontalLineToRelative(dx = 22.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _dataTableReference = it }
    }

@Suppress("ObjectPropertyName")
private var _dataTableReference: ImageVector? = null
