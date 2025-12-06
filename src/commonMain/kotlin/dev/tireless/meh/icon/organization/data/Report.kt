package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Report: ImageVector
    get() {
        val current = _report
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Report",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="8" height="2" x="10.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="12" height="2" x="10.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="5" height="2" x="10.0" y="23.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 23
                moveTo(x = 10.0f, y = 23.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 V7 a2 2 0 0 0 -2 -2 M12 4 h8 v4 h-8Z m13 24 H7 V7 h3 v3 h12 V7 h3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 5
                moveTo(x = 25.0f, y = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 21
                verticalLineToRelative(dy = 21.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // V 7
                verticalLineTo(y = 7.0f)
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
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // m 13 24
                moveToRelative(dx = 13.0f, dy = 24.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
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
        }.build().also { _report = it }
    }

@Suppress("ObjectPropertyName")
private var _report: ImageVector? = null
