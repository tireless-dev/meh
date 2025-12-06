package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseEtcd: ImageVector
    get() {
        val current = _databaseEtcd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DatabaseEtcd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20.94 20.94 v-6.6 h-1.77 V12 h.92 c.88 0 1.15 -.42 1.15 -1.25 V8.71 h2.65 V12 h2.46 v2.34 h-2.46 v7.31 h2.27 V24 h-2.11 a2.78 2.78 0 0 1 -3.1 -3.06 M6.68 24 V7.95 h10.58 v2.69 H9.72 v3.89 h6.67 v2.69 H9.72 v4.09 h7.54 V24Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.94 20.94
                moveTo(x = 20.94f, y = 20.94f)
                // v -6.6
                verticalLineToRelative(dy = -6.6f)
                // h -1.77
                horizontalLineToRelative(dx = -1.77f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 0.92
                horizontalLineToRelative(dx = 0.92f)
                // c 0.88 0 1.15 -0.42 1.15 -1.25
                curveToRelative(
                    dx1 = 0.88f,
                    dy1 = 0.0f,
                    dx2 = 1.15f,
                    dy2 = -0.42f,
                    dx3 = 1.15f,
                    dy3 = -1.25f,
                )
                // V 8.71
                verticalLineTo(y = 8.71f)
                // h 2.65
                horizontalLineToRelative(dx = 2.65f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 2.46
                horizontalLineToRelative(dx = 2.46f)
                // v 2.34
                verticalLineToRelative(dy = 2.34f)
                // h -2.46
                horizontalLineToRelative(dx = -2.46f)
                // v 7.31
                verticalLineToRelative(dy = 7.31f)
                // h 2.27
                horizontalLineToRelative(dx = 2.27f)
                // V 24
                verticalLineTo(y = 24.0f)
                // h -2.11
                horizontalLineToRelative(dx = -2.11f)
                // a 2.78 2.78 0 0 1 -3.1 -3.06
                arcToRelative(
                    a = 2.78f,
                    b = 2.78f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.1f,
                    dy1 = -3.06f,
                )
                // M 6.68 24
                moveTo(x = 6.68f, y = 24.0f)
                // V 7.95
                verticalLineTo(y = 7.95f)
                // h 10.58
                horizontalLineToRelative(dx = 10.58f)
                // v 2.69
                verticalLineToRelative(dy = 2.69f)
                // H 9.72
                horizontalLineTo(x = 9.72f)
                // v 3.89
                verticalLineToRelative(dy = 3.89f)
                // h 6.67
                horizontalLineToRelative(dx = 6.67f)
                // v 2.69
                verticalLineToRelative(dy = 2.69f)
                // H 9.72
                horizontalLineTo(x = 9.72f)
                // v 4.09
                verticalLineToRelative(dy = 4.09f)
                // h 7.54
                horizontalLineToRelative(dx = 7.54f)
                // V 24z
                verticalLineTo(y = 24.0f)
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
        }.build().also { _databaseEtcd = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseEtcd: ImageVector? = null
